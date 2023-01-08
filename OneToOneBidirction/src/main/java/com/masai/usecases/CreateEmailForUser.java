package com.masai.usecases;

import com.masai.entities.Email;
import com.masai.entities.User;
import com.masai.utility.EMUtil;

import javax.persistence.EntityManager;

public class CreateEmailForUser {

    public static void main(String[] args) {
        EntityManager em= EMUtil.provideEntityManager();
        User user=  em.find(User.class,1);

        if(user==null){
            System.out.println("User not fond..");
        }else {

            Email e1=new Email();
            e1.setEmail("abc@");

            user.setEmail(e1);
            em.getTransaction().begin();
            em.persist(e1);
            em.getTransaction().commit();
            em.close();
            System.out.println("Done...");
        }


    }
}
