package com.masai.dao;

import java.sql.ResultSet;
import java.util.List;

import com.masai.exceptions.StudentException;
import com.masai.model.Student;

public interface StudentDao {
	
	
	public String insertStudentDetails(int roll,String name,int marks);
	
	public String insertStudentDetails2(Student student);
	
	public int getMarksByRoll(int roll)throws StudentException;
	
	public Student getStudentByRoll(int roll)throws StudentException;
	
	public List<Student> getAllStudent()throws StudentException;
	

}
