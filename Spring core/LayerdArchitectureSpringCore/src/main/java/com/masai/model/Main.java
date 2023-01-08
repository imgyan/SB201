package com.masai.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.controller.StudentController;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);		
		
		StudentController controller = context.getBean("stc",StudentController.class);
		controller.setStudent();
	}

}
