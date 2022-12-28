package com.masai.usecases;

import com.masai.dao.BookDao;
import com.masai.dao.BookDaoImpl;
import com.masai.entity.Book;

import java.util.Scanner;

public class DeleteBookByIDUsecase {
    public static void main(String[] args) {
        BookDao dao =new BookDaoImpl();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter book id to delete book");
        int id= sc.nextInt();
        System.out.println(dao.deleteBookById(id));
    }
}
