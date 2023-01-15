package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.model.StudentDTO;
import com.masai.repository.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao sdao;

	@Override
	public Student registerStudent(Student student) {

		Student savedStudent = sdao.save(student);

		return savedStudent;

	}

	@Override
	public Student getStudentByRoll(Integer roll) throws StudentException {

//		 Optional<Student> opt= sdao.findById(roll);
//		
//		 if(opt.isPresent()) {
//			 
//			 Student student= opt.get();
//			 return student;
//		 }else
//			 throw new StudentException("Student does not exist with roll :"+roll);

		return sdao.findById(roll).orElseThrow(() -> new StudentException("Student does not exist with roll :" + roll));

	}

	@Override
	public List<Student> getAllStudentDetails() throws StudentException {

		List<Student> students = sdao.findAll();

		if (students.size() == 0)
			throw new StudentException("No Student found..");
		else
			return students;

	}

	@Override
	public Student deleteStudentByRoll(Integer roll) throws StudentException {

		Optional<Student> opt = sdao.findById(roll);

		if (opt.isPresent()) {

			Student existingStudent = opt.get();

			sdao.delete(existingStudent);

			return existingStudent;

		} else
			throw new StudentException("Student does not exist with roll :" + roll);

	}

	@Override
	public Student updateStudentDetails(Student student) throws StudentException {

		Optional<Student> opt= sdao.findById(student.getRoll());
		
		if(opt.isPresent()) {
			
			//this save method perform 2 operation 1. insert 2 merge
			Student updatedStudent= sdao.save(student);
			
			return updatedStudent;
			
			
		}else
			throw new StudentException("Invalid Student details..");
		
		
		
		
		
		
	}

	@Override
	public Student updateStudentMarksByRoll(Integer roll, Integer gMarks) throws StudentException {
		
		
		Student existingStudent= sdao.findById(roll).orElseThrow(() -> new StudentException("Student does not exist with Roll :"+roll));
		
		existingStudent.setMarks(existingStudent.getMarks()+gMarks);
		
		
		return sdao.save(existingStudent);
		
		
		
		
		
	}

	@Override
	public List<Student> getStudentsByAddress(String address) throws StudentException {
		
		List<Student> students= sdao.findByAddress(address);
		
		if(students.isEmpty())
			throw new StudentException("No Student found with Address :"+address);
		
		
		return students;
		
		
	}

	@Override
	public Student getStudentByMarks(Integer marks) throws StudentException {
		
	
		
		Optional<Student> opt= sdao.findByMarks(marks);
		
		return opt.orElseThrow(() -> new StudentException("Student does not exist with Marks :"+marks));
		
		
	}

	@Override
	public String getStudentNameByRoll(Integer roll) throws StudentException {
		
		
		String name= sdao.getStudentNameByRoll(roll);
		
		if(name != null)
			return name;
		else
			throw new StudentException("Student not found with roll :"+roll);
		
	}

	@Override
	public List<String> getStudentNameAndMarksByAddress(String address) throws StudentException {
		
		
		List<String> results= sdao.getStudentNameAndMarksByAddress(address);
		
		
		if(results.isEmpty())
			throw new StudentException("Student not found with Address: "+address);
		else
			return results;
	}

	@Override
	public List<StudentDTO> getStudentNameAndMarksByAddress2(String address) throws StudentException {
		
		
		List<StudentDTO> dtos= sdao.getStudentNameAndMarksByAddress2(address);
		
		if(dtos.isEmpty())
			throw new StudentException("Student not found with Address: "+address);
		else
			return dtos;
		
	}

	
	
	
	
	
	
	
	
}
