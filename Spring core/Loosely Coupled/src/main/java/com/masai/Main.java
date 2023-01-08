package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ctc=new AnnotationConfigApplicationContext(AppConfig.class);
		AnnotationConfigApplicationContext ctc2=(AnnotationConfigApplicationContext)ctc;
		
		Travel tr=ctc.getBean("tr",Travel.class);
		tr.journey();
	}

}
