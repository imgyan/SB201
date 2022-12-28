package com.masai.usecases;

import com.masai.dao.BookDao;
import com.masai.dao.BookDaoImpl;

import java.util.Scanner;

public class UpdateBookPriceByIdUseCase {

    public static void main(String[] args) {
        BookDao dao=new BookDaoImpl();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Book id to double price");
        int id= sc.nextInt();
        System.out.println(dao.updateBookById(2,id));
    }
}
