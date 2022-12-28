package com.masai.usescases;

import com.masai.entities.Department;
import com.masai.entities.Employee;
import com.masai.utility.EMUtil;
import jakarta.persistence.EntityManager;

public class AddingAnotherEmployee {

    public static void main(String[] args) {
        EntityManager em=EMUtil.provideEntityManager();
        Employee emp=new Employee();
        emp.setName("Amit");
        emp.setSalary(6500);


        Department dept=em.find(Department.class,1);


        em.getTransaction().begin();

        dept.getEmp().add(emp);
        em.getTransaction().commit();
        System.out.println("Employee added successfully...");

        em.close();
    }
}
