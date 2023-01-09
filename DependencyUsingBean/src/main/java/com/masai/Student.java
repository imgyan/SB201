package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Component
//@Scope("prototype")
public class Student {

    private int roll;
    private String name;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    @Autowired
    private List<Student> students;

    @PostConstruct
    public void setUp() {
        System.out.println("inside set up method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("inside destroy method");
    }

    public  void funStudent(){
        students.forEach(s-> System.out.println(s));
    }
}
