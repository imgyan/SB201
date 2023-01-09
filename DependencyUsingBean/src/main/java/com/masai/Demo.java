package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        City obj1 = ctx.getBean("city", City.class);
        obj1.funA();


        Student obj2 = ctx.getBean("student", Student.class);
        obj2.funStudent();

        ( (AnnotationConfigApplicationContext)ctx).close();
    }
}
