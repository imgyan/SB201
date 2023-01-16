package com.masai.service;

import java.util.Optional;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.AccountException;
import com.masai.exception.InsufficientFundException;
import com.masai.model.Account;
import com.masai.model.AccountDTO;
import com.masai.repo.AccountRepo;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountRepo accountRepo;

	@Override
	public Account openAccount(Account acc) throws AccountException {
		Account op = accountRepo.save(acc);
		if(op==null) {
			throw new AccountException("No Account saved");
		}else {
		return op;
		}
	}

	@Override
	public Account closeAccount(Integer accno) throws AccountException {
		Optional<Account> optional= accountRepo.findById(accno);
		if(optional.isPresent()) {
			Account exAccount=optional.get();
			accountRepo.delete(exAccount);
			return exAccount;
		}else {
			throw new AccountException("No Account found with "+ accno);
		}
	}

	@Override
	public Account depositAmount(Integer accno, Integer amount) throws AccountException {
		Optional<Account> optional= accountRepo.findById(accno);
		if(optional.isPresent()) {
			Account exAccount=optional.get();
			exAccount.setBalance(exAccount.getBalance()+amount);
			accountRepo.save(exAccount);
			return exAccount;
		}else {
			throw new AccountException("No Account found with "+ accno);
		}
	}

	@Override
	public Account withdrawAmount(int accno, Integer amount) throws AccountException, InsufficientFundException {
		Optional<Account> optional= accountRepo.findById(accno);
		if(optional.isPresent()) {
			
			Account exAccount=optional.get();
			if(exAccount.getBalance()<amount) {
				throw new InsufficientFundException("Insufficient Balance ");
			}else {
			exAccount.setBalance(exAccount.getBalance()-amount);
			accountRepo.save(exAccount);
			return exAccount;
			}
		}else {
			throw new AccountException("No Account found with "+ accno);
		}
	}

	@Override
	public String transferAmount(AccountDTO dto) throws AccountException, InsufficientFundException {
		// TODO Auto-generated method stub
		Optional<Account> optional1= accountRepo.findById(dto.getSrcAccno());
		Optional<Account> optional2= accountRepo.findById(dto.getDesAccno());
		
		if(optional1.isPresent()&&optional2.isPresent()) {
			Account per1=optional1.get();
			Account per2=optional2.get();
			
			if(per1.getBalance()<dto.getAmount()) {
				throw new InsufficientFundException("Insufficient fund");
			}else {
				per2.setBalance(per2.getBalance()+dto.getAmount());
				per1.setBalance(per1.getBalance()-dto.getAmount());
				accountRepo.save(per1);
				accountRepo.save(per2);
				return "SuccessFull";
			}
		}else {
			throw new AccountException("Invalid Acoount");
		}
		
	}

}
