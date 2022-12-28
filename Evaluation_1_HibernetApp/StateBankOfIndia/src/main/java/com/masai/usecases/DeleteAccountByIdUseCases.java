package com.masai.usecases;

import com.masai.dao.StateBankDao;
import com.masai.dao.StateBankDaoImpl;

import java.util.Scanner;

public class DeleteAccountByIdUseCases {

    public static void main(String[] args) {
        StateBankDao dao= new StateBankDaoImpl();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id to delete Account");
        int id= sc.nextInt();
        System.out.println(dao.deleteAccountById(id));
    }
}
