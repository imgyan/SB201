package com.masai.dao;

import com.masai.entities.Course;
import com.masai.exceptions.CourseNotFoundException;
import com.masai.utility.EMUtil;

import javax.persistence.EntityManager;

public class CourseDaoImpl implements CourseDao {
    @Override
    public void addCourse(Course course) {
        EntityManager em = EMUtil.provideEntityManager();

        em.getTransaction().begin();
        em.persist(course);
        em.getTransaction().commit();
        em.close();
        System.out.println("New Course has been added....");
    }

    @Override
    public void getCourse(int course_id) throws CourseNotFoundException {
        EntityManager em = EMUtil.provideEntityManager();

        Course course = em.find(Course.class, course_id);
      if(course==null)throw new CourseNotFoundException("Course Not found with course id : "+course_id);
      em.close();
        System.out.println(course);
    }
}
