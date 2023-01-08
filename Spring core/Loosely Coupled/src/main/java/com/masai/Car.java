package com.masai;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	
	public static void goCar() {
		System.out.println("Car Started");
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		goCar();
	}

}
