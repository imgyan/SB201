package com.masai.usescases;

import com.masai.entities.Department;
import com.masai.entities.Employee;
import com.masai.utility.EMUtil;
import jakarta.persistence.EntityManager;

public class InsertDetails {

    public static void main(String[] args) {
      EntityManager em= EMUtil.provideEntityManager();

        Employee emp1=new Employee();
        emp1.setName("Aman");
        emp1.setSalary(90000);

        Employee emp2=new Employee();
        emp2.setName("Rahul");
        emp2.setSalary(80000);

        Department dept=new Department();

        dept.setDname("HR");
        dept.setLocation("Pune");

        dept.getEmp().add(emp1);
        dept.getEmp().add(emp2);

        em.getTransaction().begin();

        em.persist(dept);
        em.getTransaction().commit();


        System.out.println("Done....");

        em.close();


    }
}
