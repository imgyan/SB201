package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private int roll;
	private String name;

	public Student() {
	}

	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", roll=" + roll +
				", name='" + name + '\'' +
				'}';
	}
}