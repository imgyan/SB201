package com.masai.usecases;

import com.masai.entities.FullTimeInstructor;
import com.masai.entities.PartTimeInstructor;
import com.masai.utility.EMUtil;
import jakarta.persistence.EntityManager;

public class InsertRecord {

    public static void main(String[] args) {
      EntityManager em= EMUtil.provideEntityManager();

        FullTimeInstructor f1=new FullTimeInstructor();
        f1.setInstructorName("A");
        f1.setSalary(9000);
        f1.setEmail("abc@gmail.com");

        PartTimeInstructor p1=new PartTimeInstructor();
        p1.setInstructorName("x");
        p1.setNoOfSession(10);
        p1.setCostPerSession(1000);
        p1.setMobileNumber("9097765438");

        em.getTransaction().begin();
        em.persist(f1);
        em.persist(p1);
        em.getTransaction().commit();
        em.close();
        System.out.println("Done.....");



    }

}
