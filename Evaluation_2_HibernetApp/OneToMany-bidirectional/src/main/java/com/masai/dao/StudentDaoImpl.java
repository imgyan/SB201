package com.masai.dao;

import com.masai.entities.Student;
import com.masai.exceptions.StudentNotFoundException;
import com.masai.utility.EMUtil;

import javax.persistence.EntityManager;

public class StudentDaoImpl implements StudentDao{
    @Override
    public void getStudent(int roll_no) throws StudentNotFoundException {
       EntityManager em= EMUtil.provideEntityManager();

       Student student=  em.find(Student.class,roll_no);

       if(student==null) throw new  StudentNotFoundException("Student not found with roll :"+roll_no);
        em.close();
        System.out.println("Name is :"+student.getName());
        System.out.println("Roll is :"+student.getRollNo());
        System.out.println("Email is :"+student.getEmail());
        System.out.println("Mobile is :"+student.getMobile());
        System.out.println("Course is :"+student.getCourse());
      //  System.out.println(student);
    }
}
