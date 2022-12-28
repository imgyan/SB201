package com.masai.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // to make a java bean class an entity class
@Table(name="student")  // if the table name and class is different
public class Student {
    @Id
    private int roll;
    private String sname;
    private int marks;

    public Student() {
    }

    public Student(int roll, String sname, int marks) {
        this.roll = roll;
        this.sname = sname;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Students{" +
                "roll=" + roll +
                ", sname='" + sname + '\'' +
                ", marks=" + marks +
                '}';
    }
}
