package com.masai;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = "com.masai")
public class AppConfig {
	@Bean
	public  Map<Department, Employee> map(){

		Map<Department, Employee> map=new HashMap();

		map.put(new Department(1, "Sales", "Delhi"),new Employee(8, "Aman", "Uttarakhand", 50000));
		map.put(new Department(2, "Marketing", "Uttarakhand"),new Employee(123, "Gyan", "Uttarakhand", 50000));
		map.put(new Department(3, "Accounts", "Punjab"),new Employee(543, "Shivam", "Uttarakhand", 50000));

		return map;

	}

}
