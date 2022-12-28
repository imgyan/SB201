package com.masai.dao;

import com.masai.entity.Account;
import com.masai.utility.EMUtil;

import javax.persistence.EntityManager;
import java.time.LocalDate;

public class StateBankDaoImpl implements  StateBankDao{
    @Override
    public Account findAccountById(int id) {
      EntityManager em= EMUtil.provideEntityManager();

     Account account= em.find(Account.class,id);
     em.close();
     return account;
    }

    @Override
    public String saveAccount(Account account) {
        EntityManager em = EMUtil.provideEntityManager();
      //  account.setCreated_date(LocalDate.now());

        em.getTransaction().begin();
        em.persist(account);
        em.getTransaction().commit();
        em.close();
        return "Account Created";
    }

    @Override
    public String deleteAccountById(int id) {
      EntityManager em= EMUtil.provideEntityManager();
      Account account= em.find(Account.class,id);
      if(account==null){
          return "Account not found";
      }
      else {
          em.getTransaction().begin();
          em.remove(account);
          em.getTransaction().commit();
          return "Account deleted successfully";
      }
    }

    @Override
    public String withdrawFromAccount(double amount, int accountId) {
        String msg;
        EntityManager em= EMUtil.provideEntityManager();
        Account account= em.find(Account.class,accountId);
        if(account==null){
            msg= "Account not found";
        }else {
            if(amount>account.getBalance()){
                msg="Insufficient Balence";
            }else {
                em.getTransaction().begin();
                account.setBalance(account.getBalance()-amount);
                em.getTransaction().commit();
                msg="Amount Withdraw Successfully";
            }
        }
        em.close();
        return msg;
    }

    @Override
    public String depositInAccount(double amount, int accountId) {
        String msg;
        EntityManager em= EMUtil.provideEntityManager();
        Account account= em.find(Account.class,accountId);
        if(account==null){
            msg= "Account not found";
        }else {
                em.getTransaction().begin();
                account.setBalance(account.getBalance()+amount);
                em.getTransaction().commit();
                msg="Amount deposited Successfully";
            }

        em.close();
        return msg;
    }
}
