package com.masai.usescases;

import com.masai.entities.Employee;
import com.masai.utility.EMUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class GettingAllTheEmployees {


    public static void main(String[] args) {
       EntityManager em= EMUtil.provideEntityManager();

       String jpql="select emp from Department where dname=:dn";

       Query q= em.createQuery(jpql);

       q.setParameter("dn","HR");


           List<Employee> employees= q.getResultList();

           employees.forEach(e-> System.out.println(e));

     em.close();

    }
}
