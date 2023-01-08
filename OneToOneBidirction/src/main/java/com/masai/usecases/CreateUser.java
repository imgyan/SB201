package com.masai.usecases;

import com.masai.entities.Email;
import com.masai.entities.User;
import com.masai.utility.EMUtil;

import javax.persistence.EntityManager;
import java.time.LocalDate;

public class CreateUser {

    public static void main(String[] args) {
       EntityManager em= EMUtil.provideEntityManager();

        User u1=new User();
        u1.setName("Aman");
        u1.setDateOfBirth(2000);
        u1.setPhoneNo("789378799");

        Email e1=new Email();
        e1.setEmail("hsdah@");

        e1.setCreated_date(LocalDate.now());


        u1.setEmail(e1);
        e1.setUser(u1);

        em.getTransaction().begin();
        em.persist(u1);
        em.getTransaction().commit();
        em.close();
        System.out.println("Done...");
    }
}
