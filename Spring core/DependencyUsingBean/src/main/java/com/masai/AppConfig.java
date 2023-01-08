package com.masai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ComponentScan(basePackages = "com.masai")
@PropertySource("a1.properties")
public class AppConfig {


    @Bean
    public List<Student>  getStudent(){

        List<Student> students=new ArrayList<>();

        Student s1=new Student();
        s1.setName("Aman");
        s1.setRoll(1);
        students.add(s1);

        return students;
    }
}
