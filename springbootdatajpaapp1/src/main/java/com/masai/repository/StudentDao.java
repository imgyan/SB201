package com.masai.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.model.StudentDTO;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer>{

	public List<Student> findByAddress(String address);
	
	//public  Student findByMarks(int marks);
	
	public  Optional<Student> findByMarks(int marks);
	
//	@Query("select s.name from Student s where s.roll=:r ")  //named placeholder
//	public String getStudentNameByRoll(@Param("r") Integer roll);
	
	@Query("select s.name from Student s where s.roll=?1")  //positional placeholder
	public String getStudentNameByRoll(Integer roll);
	
	@Query("select s.name, s.marks from Student s where s.address=?1")
	public List<String> getStudentNameAndMarksByAddress(String address)throws StudentException;
	
	@Query("select new com.masai.model.StudentDTO(s.name,s.marks) from Student s where s.address=?1")
	public List<StudentDTO> getStudentNameAndMarksByAddress2(String address)throws StudentException;
	
	
	
}


