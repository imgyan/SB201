package com.masai.usecases;

import com.masai.dao.StateBankDao;
import com.masai.dao.StateBankDaoImpl;
import com.masai.entity.Account;

import java.time.LocalDate;
import java.util.Date;

public class SaveAcoountUseCases {
    public static void main(String[] args) {
        StateBankDao dao=new StateBankDaoImpl();

      Account account=new Account("abc@gmail.com","Pune",700000,new Date(System.currentTimeMillis()));

      String msg=dao.saveAccount(account);
        System.out.println(msg);
    }
}
