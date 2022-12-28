package com.masai.dao;

import com.masai.entity.Book;

public interface BookDao {

    public String saveBook(Book book);
    public Book findBookById(int id);
    public String deleteBookById(int id);
    public String updateBookById(int price,int id);



}
