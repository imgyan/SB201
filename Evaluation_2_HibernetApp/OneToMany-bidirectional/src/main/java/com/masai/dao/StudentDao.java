package com.masai.dao;

import com.masai.exceptions.StudentNotFoundException;

public interface StudentDao {

    public void getStudent(int roll_no) throws StudentNotFoundException;
}
