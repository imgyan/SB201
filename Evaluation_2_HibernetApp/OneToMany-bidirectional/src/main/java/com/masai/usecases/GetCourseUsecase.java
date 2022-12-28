package com.masai.usecases;

import com.masai.dao.CourseDao;
import com.masai.dao.CourseDaoImpl;
import com.masai.exceptions.CourseNotFoundException;

import java.util.Scanner;

public class GetCourseUsecase {

    public static void main(String[] args) {
        CourseDao dao=new CourseDaoImpl();
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Course id:-");

        int  id= sc.nextInt();
        try {
            dao.getCourse(id);
        } catch (CourseNotFoundException e) {
            System.out.println(e);
        }
    }
}
