package com.masai.dao;

import com.masai.entity.Book;
import com.masai.utility.EMUtil;

import javax.persistence.EntityManager;

public class BookDaoImpl implements BookDao{
    @Override
    public String saveBook(Book book) {
      EntityManager em= EMUtil.provideEntityManager();
      em.getTransaction().begin();
      em.persist(book);
      em.getTransaction().commit();
      em.close();
      return "Book Library Created...";
    }

    @Override
    public Book findBookById(int id) {
      EntityManager em=  EMUtil.provideEntityManager();
     Book book= em.find(Book.class,id);
     em.close();
     return book;
    }

    @Override
    public String deleteBookById(int id) {
        String msg;
      EntityManager em= EMUtil.provideEntityManager();
      Book book=em.find(Book.class,id);
      if(book==null)
          msg= "Book not found with id: "+id;
      else{
          em.getTransaction().begin();
          em.remove(book);
          em.getTransaction().commit();
          msg="Book deleted successfully";
      }
      em.close();
      return msg;
    }

    @Override
    public String updateBookById(int price, int id) {
        String msg;
        EntityManager em= EMUtil.provideEntityManager();
        Book book=em.find(Book.class,id);
        if(book==null)
            msg= "Book not found with id: "+id;
        else {
            em.getTransaction().begin();
            book.setPrice(book.getPrice()*price);
            em.getTransaction().commit();
            msg="Book price double successfully";
        }
        em.close();
        return msg;
    }
}
