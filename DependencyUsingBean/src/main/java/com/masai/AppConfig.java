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
    public List<String>  getStudent(){

        List<String> students=new ArrayList<>();
        students.add("A");
        students.add("B");
        students.add("C");

        return students;
    }
}
