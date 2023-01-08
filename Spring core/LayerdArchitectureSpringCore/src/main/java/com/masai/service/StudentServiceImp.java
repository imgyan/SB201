package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Student;
import com.masai.repository.StudentRepoImpl;


@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentRepoImpl impl;

    @Override
    public Student addStudent(Student student) {

        return impl.setStudent(student);
    }

}
