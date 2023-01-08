package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    public static void main(String[] args) {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");

                     Tourist t= ctx.getBean(Tourist.class,"t");
                       System.out.println(t);

              HolidayPackage holidayPackage= ctx.getBean(HolidayPackage.class,"h");
              holidayPackage.showDetails();
    }
}
