package com.masai.usecases;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exceptions.StudentNotFoundException;

import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class GetStudentUsecase {

    public static void main(String[] args) {
        StudentDao dao=new StudentDaoImpl();
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Roll no:-");

        int  roll= sc.nextInt();
        try {
            dao.getStudent(roll);
        } catch (StudentNotFoundException e) {
            System.out.println(e);
        }
    }
}
