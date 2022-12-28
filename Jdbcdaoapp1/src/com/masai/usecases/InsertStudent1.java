package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.StudentDaoImpl;

public class InsertStudent1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Roll :");
		int roll= sc.nextInt();
		
		System.out.println("Enter Name :");
		String name= sc.next();
		
		System.out.println("Enter Marks :");
		int marks= sc.nextInt();
		
		
		StudentDaoImpl dao = new StudentDaoImpl();
		
		String result= dao.insertStudentDetails(roll, name, marks);
		
		System.out.println(result);
		
		
		
		
		
	}

}
