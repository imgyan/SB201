package com.masai.entities;

import jakarta.persistence.Entity;

@Entity
public class FullTimeInstructor extends Instructor {
    private int salary;

    private String email;


    public FullTimeInstructor() {
    }

    public FullTimeInstructor(int salary, String email) {
        this.salary = salary;
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "FullTimeInstructor{" +
                "salary=" + salary +
                ", email='" + email + '\'' +
                '}';
    }


}
