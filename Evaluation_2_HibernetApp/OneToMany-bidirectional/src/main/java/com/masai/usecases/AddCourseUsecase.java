package com.masai.usecases;

import com.masai.dao.CourseDao;
import com.masai.dao.CourseDaoImpl;
import com.masai.entities.Course;
import com.masai.entities.Student;

public class AddCourseUsecase {

    public static void main(String[] args) {

        CourseDao dao=new CourseDaoImpl();

        Course course=new Course();

        course.setCourseName("DSA");
        course.setDuration("3 Months");
        course.setFee(4000);

        Student student=new Student();
        student.setName("Aman");
        student.setEmail("aman@gmail.com");
        student.setMobile("8089384886");
        student.setCourse(course);

        course.getStudents().add(student);

            dao.addCourse(course);

    }
}
