package com.masai.usecases;

import com.masai.entities.User;
import com.masai.utility.EMUtil;

import javax.persistence.EntityManager;

public class DeleteUser {

    public static void main(String[] args) {
        EntityManager em= EMUtil.provideEntityManager();

        User user=  em.find(User.class,3);
        if(user==null){
            System.out.println("User not fond..");
        }
        else {
            em.getTransaction().begin();
            em.remove(user);
            em.getTransaction().commit();
            em.close();
            System.out.println("Done...");
        }
    }
}
