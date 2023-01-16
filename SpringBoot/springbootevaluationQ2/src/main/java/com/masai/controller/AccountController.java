package com.masai.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Account;
import com.masai.model.AccountDTO;
import com.masai.service.AccountService;

@RestController
public class AccountController {
	@Autowired
	private AccountService accountService;

	@PostMapping("/account")
	public ResponseEntity<Account> SaveAccount(@Valid @RequestBody Account acc) {

		return new ResponseEntity<>(accountService.openAccount(acc), HttpStatus.CREATED);

	}

	@DeleteMapping("/account/{accno}")
	public ResponseEntity<Account> deleteAccount(@PathVariable("accno") Integer accNo) {
		Account account = accountService.closeAccount(accNo);

		return new ResponseEntity<>(account, HttpStatus.ACCEPTED);
	}

//	@PutMapping("/account/{accno}/{balance}")
//	public ResponseEntity<Account> depositeBalance(@PathVariable("accno") Integer accno,
//			@PathVariable("balance") Integer balance) {
//		Account account = accountService.depositAmount(accno, balance);
//
//		return new ResponseEntity<>(account, HttpStatus.ACCEPTED);
//	}
	
	@PutMapping("/account/{accno}")
	public ResponseEntity<Account> depositeBalance(@PathVariable("accno") Integer accno,
			@RequestParam("balance") Integer balance) {
		Account account = accountService.depositAmount(accno, balance);

		return new ResponseEntity<>(account, HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/withdrawammount/{accno}/{balance}")
	public ResponseEntity<Account> withdrawBalance(@PathVariable("accno") Integer accno,
			@PathVariable("balance") Integer balance) {
		Account account = accountService.withdrawAmount(accno, balance);

		return new ResponseEntity<>(account, HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/transferBalance")
	public ResponseEntity<String> transfer(@RequestBody AccountDTO acc){
		
		String aDto=accountService.transferAmount(acc);
		
		return new ResponseEntity<>(aDto, HttpStatus.ACCEPTED);
		
	}

}
