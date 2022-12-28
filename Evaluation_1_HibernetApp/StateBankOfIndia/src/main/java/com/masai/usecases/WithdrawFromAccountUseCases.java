package com.masai.usecases;

import com.masai.dao.StateBankDao;
import com.masai.dao.StateBankDaoImpl;

import java.util.Scanner;

public class WithdrawFromAccountUseCases {

    public static void main(String[] args) {
        StateBankDao dao=new StateBankDaoImpl();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id No to withdraw");
        int id= sc.nextInt();
        System.out.println("Enter Amount to withdraw");
        double amount= sc.nextInt();
        System.out.println(dao.withdrawFromAccount(amount,id));
    }
}
