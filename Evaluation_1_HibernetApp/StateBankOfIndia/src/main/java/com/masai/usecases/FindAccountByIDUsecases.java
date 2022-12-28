package com.masai.usecases;

import com.masai.dao.StateBankDao;
import com.masai.dao.StateBankDaoImpl;
import com.masai.entity.Account;

import java.util.Scanner;

public class FindAccountByIDUsecases {

    public static void main(String[] args) {
        StateBankDao dao=new StateBankDaoImpl();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id Number to find Account");
        int id=sc.nextInt();

       Account account= dao.findAccountById(id);
        System.out.println(account);

    }

}
