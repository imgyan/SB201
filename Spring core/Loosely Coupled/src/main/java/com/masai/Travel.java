package com.masai;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("tr")
public class Travel {
	
	@Autowired
	private Vehicle vehicle;
	
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	@PostConstruct
	public void start() {
		System.out.println("Started");
	}
//	@PreDestroy
//	public void end() {
//		System.out.println("Ended");
//	}
	
	public void journey() {
		vehicle.go();
		System.out.println("Jounrney started...");

	}
	

}
