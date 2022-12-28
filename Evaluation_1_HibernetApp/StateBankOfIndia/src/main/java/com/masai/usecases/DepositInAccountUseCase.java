package com.masai.usecases;

import com.masai.dao.StateBankDao;
import com.masai.dao.StateBankDaoImpl;

import java.util.Scanner;

public class DepositInAccountUseCase {

    public static void main(String[] args) {
        StateBankDao dao=new StateBankDaoImpl();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id No to deposit");
        int id= sc.nextInt();
        System.out.println("Enter Amount to deposit");
        double amount= sc.nextInt();
        System.out.println(dao.depositInAccount(amount,id));
    }
}
