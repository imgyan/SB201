package com.masai.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {


        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Student");


        EntityManager em= emf.createEntityManager();



/*  To Find :-


        Student s= em.find(Student.class, 35);

        if(s != null)
            System.out.println(s);
        else
            System.out.println("Student does not exit..");

        em.close();


 */



  /*     To insert:-


        Student s=new Student(36, "Aman", 780);


        em.getTransaction().begin();

        em.persist(s);

        em.getTransaction().commit();

        em.close();

        System.out.println("done");

*/






/*    To Update:-


 Scanner sc=new Scanner(System.in);

        System.out.println("Enter roll to give grace marks ");
        int roll=sc.nextInt();

        Student student=em.find(Student.class, roll); //if it returns the obj then the obj will be in p.state


        if(student == null){
            System.out.println("Student does not exist..");
        }
        else
        {

            System.out.println("Enter the grace marks");
            int marks=sc.nextInt();

            em.getTransaction().begin();

            student.setMarks(student.getMarks()+marks);

            em.getTransaction().commit();

            System.out.println("Marks is graced...");

        }
        em.close();

        System.out.println("done");

 */

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter roll to delete ");
        int roll=sc.nextInt();

        Student student= em.find(Student.class, roll);

        if(student != null){

            em.getTransaction().begin();

            em.remove(student);

            em.getTransaction().commit();


            System.out.println("Student removed....");

        }else
            System.out.println("Student not found...");

        em.close();


        System.out.println("done");




    }
}
