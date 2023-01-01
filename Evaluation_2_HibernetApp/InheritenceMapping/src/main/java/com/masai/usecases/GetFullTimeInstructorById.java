package com.masai.usecases;

import com.masai.entities.FullTimeInstructor;
import com.masai.utility.EMUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;
import java.util.Scanner;

public class GetFullTimeInstructorById {
    public static void main(String[] args) {
        EntityManager em= EMUtil.provideEntityManager();

        String jpql="from FullTimeInstructor where instructorId=1";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Instructor id ");
        int iId=sc.nextInt();
        em.setProperty("id",iId);
        Query q= em.createQuery(jpql);

       FullTimeInstructor fullTimeInstructor= (FullTimeInstructor) q.getSingleResult();
            System.out.println("Instructor Name is : "+fullTimeInstructor.getInstructorName());
            System.out.println("Instructor Salary is : "+fullTimeInstructor.getSalary());
            System.out.println("Instructor Email is : "+fullTimeInstructor.getEmail());



    }
}
