package com.masai.usecases;

import com.masai.entities.User;
import com.masai.utility.EMUtil;

import javax.persistence.EntityManager;

public class RetrieveDetailOfEmailforAUser {

    public static void main(String[] args) {
        EntityManager em= EMUtil.provideEntityManager();
        User user=  em.find(User.class,1);
        if(user==null){
            System.out.println("User not fond..");
        }else {
            System.out.println(user.getEmail());
        }
    }
}
