package com.masai.usecases;

import com.masai.dao.BookDao;
import com.masai.dao.BookDaoImpl;
import com.masai.entity.Book;

import java.time.LocalDateTime;

public class SaveBookUseCasses {
    public static void main(String[] args) {
        BookDao dao=new BookDaoImpl();
        Book book= new Book("C++","Nitesh","Rajput Publication","Computer Programming",
                    1500,240, LocalDateTime.now());


        System.out.println(dao.saveBook(book));

    }
}
