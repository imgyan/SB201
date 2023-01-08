package com.masai.repository;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.masai.DBUtil.EMUtil;
import com.masai.model.Student;

@Repository
public class StudentRepoImpl implements StudentRepo{
	
	@Override
	public Student setStudent(Student student) {
		EntityManager manager = EMUtil.provideEntityManager();
		manager.getTransaction().begin();
		manager.persist(student);
		manager.getTransaction().commit();
		manager.close();
		return student;
	}

}
