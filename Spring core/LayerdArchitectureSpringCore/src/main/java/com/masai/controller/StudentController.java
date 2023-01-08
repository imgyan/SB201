package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

import com.masai.model.Student;
import com.masai.service.StudentServiceImp;

@Controller("stc")
public class StudentController {
	
	@Autowired
	private StudentServiceImp imp;

	@Value("${db.roll}")
	private int roll;

	@Autowired
	private Environment env;
	
	public void setStudent() {	
		Student student = imp.addStudent(new Student(roll,env.getProperty("db.name")));
		System.out.println(student);
	}
}
