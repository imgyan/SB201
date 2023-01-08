package com.masai;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	public static void goBike() {
		System.out.println("Bike Started");
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		goBike();
		
	}

}
