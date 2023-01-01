package com.masai.usecases;

import com.masai.entities.FullTimeInstructor;
import com.masai.utility.EMUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class GetFullTimeInstructor {

    public static void main(String[] args) {
        EntityManager em= EMUtil.provideEntityManager();

        String jpql="from FullTimeInstructor";
         Query q= em.createQuery(jpql);
          List<FullTimeInstructor> fullTimeInstructorList= q.getResultList();

         // fullTimeInstructorList.forEach(f-> System.out.println(f));

        for (FullTimeInstructor f:fullTimeInstructorList){
            System.out.println("Instructor Name is : "+f.getInstructorName());
            System.out.println("Instructor Salary is : "+f.getSalary());
            System.out.println("Instructor Email is : "+f.getEmail());
            System.out.println("==========================================");
        }


    }
}
