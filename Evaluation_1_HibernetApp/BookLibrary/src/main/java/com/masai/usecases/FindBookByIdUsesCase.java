package com.masai.usecases;

import com.masai.dao.BookDao;
import com.masai.dao.BookDaoImpl;
import com.masai.entity.Book;

import java.util.Scanner;

public class FindBookByIdUsesCase {

    public static void main(String[] args) {
        BookDao dao=new BookDaoImpl();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Book id to get details");
        int id = sc.nextInt();
       Book book= dao.findBookById(id);
       if (book==null){
           System.out.println("Book not found with id :"+id);
       }else {
           System.out.println(book);
       }


    }
}
