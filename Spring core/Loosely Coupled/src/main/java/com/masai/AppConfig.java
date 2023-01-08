package com.masai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.masai")
public class AppConfig {
	
	@Bean
	public Vehicle vehicle(){
		Vehicle v=new Bike();
		
		return v;
		
	}

}
