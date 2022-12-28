package com.masai.dao;

import com.masai.entities.Course;
import com.masai.exceptions.CourseNotFoundException;

public interface CourseDao {

     public void addCourse(Course course);
     public void getCourse(int course_id)throws CourseNotFoundException;
}
