package com.masai;

import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
@Lazy
public class Demo {

	private Map<Department, Employee> theMap;

	@Autowired
	public void setTheMap(Map<Department, Employee> theMap) {
		this.theMap = theMap;
	}

	@PostConstruct
	public void myInit(){

		System.out.println("inside myInit method");
    }
    @PreDestroy
	public void cleanUp(){
		System.out.println("inside cleanUp method");
	}
	public void showDetails(){
		System.out.println("inside showDetails of Demo class");
		//print all the details of all the employees department-wise.
		for(Entry<Department, Employee> x: theMap.entrySet()) {
			System.out.println(x.getKey().toString()+" "+x.getValue().toString());
		}
	}
	public static void main(String[] args) {

		ApplicationContext ctc=new AnnotationConfigApplicationContext(AppConfig.class);
		AnnotationConfigApplicationContext ctc2=(AnnotationConfigApplicationContext)ctc;

		Demo d=ctc.getBean("demo",Demo.class);
		//System.out.println(employee);
		d.showDetails();
		ctc2.close();

	}
}
