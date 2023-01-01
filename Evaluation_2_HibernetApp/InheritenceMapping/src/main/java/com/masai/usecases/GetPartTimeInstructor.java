package com.masai.usecases;

import com.masai.entities.FullTimeInstructor;
import com.masai.entities.PartTimeInstructor;
import com.masai.utility.EMUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class GetPartTimeInstructor {

    public static void main(String[] args) {
        EntityManager em= EMUtil.provideEntityManager();

        String jpql="from PartTimeInstructor";
        Query q= em.createQuery(jpql);
        List<PartTimeInstructor> partTimeInstructorList= q.getResultList();

        // fullTimeInstructorList.forEach(f-> System.out.println(f));

        for (PartTimeInstructor p:partTimeInstructorList){
            System.out.println("Instructor Name is : "+p.getInstructorName());
            System.out.println("Instructor Mobile is : "+p.getMobileNumber());
            System.out.println("Instructor CostPerSession is : "+p.getCostPerSession());
            System.out.println("Instructor NoOfSession is : "+p.getNoOfSession());
            System.out.println("==========================================");
        }


    }
}
