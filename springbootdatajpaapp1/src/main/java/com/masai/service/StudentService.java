package com.masai.service;

import java.util.List;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.model.StudentDTO;

public interface StudentService {
	
	
	public Student registerStudent(Student student);
	
	public Student getStudentByRoll(Integer roll)throws StudentException;
	
	public List<Student> getAllStudentDetails()throws StudentException;
	
	public Student deleteStudentByRoll(Integer roll)throws StudentException;
	
	public Student updateStudentDetails(Student student)throws StudentException;
	
	public Student updateStudentMarksByRoll(Integer roll,Integer gMarks)throws StudentException;

	public List<Student> getStudentsByAddress(String address)throws StudentException;
	
	public Student getStudentByMarks(Integer marks)throws StudentException;
	
	
	public String getStudentNameByRoll(Integer roll)throws StudentException;
	
	public List<String> getStudentNameAndMarksByAddress(String address)throws StudentException;
	
	public List<StudentDTO> getStudentNameAndMarksByAddress2(String address)throws StudentException;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
