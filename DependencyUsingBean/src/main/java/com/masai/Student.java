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
    @Autowired
    private List<String> students;

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
