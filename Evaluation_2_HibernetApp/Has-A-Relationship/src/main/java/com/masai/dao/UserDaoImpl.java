package com.masai.dao;

import com.masai.entities.User;
import com.masai.exceptions.UserNotFoundException;
import com.masai.utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class UserDaoImpl implements UserDao{
    @Override
    public User createUser(User user) throws UserNotFoundException {

       EntityManager em= EMUtil.provideEntityManager();


       if (user==null) throw new UserNotFoundException("Please provide correct user details....");

           em.getTransaction().begin();
           em.persist(user);
           em.getTransaction().commit();
           em.close();
           return user;


    }

    @Override
    public List<User> findByName(String name) throws UserNotFoundException {
        EntityManager em= EMUtil.provideEntityManager();



        String jpql="from User where userName=:name";

         Query q= em.createQuery(jpql);

         q.setParameter("name",name);

        List<User> users=   q.getResultList();

         if(users.isEmpty()){
             throw new  UserNotFoundException("User Not found with Name :"+name);
         }else {
             return users;
         }

    }
}
