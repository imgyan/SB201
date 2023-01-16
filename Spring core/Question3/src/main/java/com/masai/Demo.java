package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
           PersonService personService= ctx.getBean("aid",PersonService.class);

           personService.printSkillMap();
        PersonService personService1= ctx.getBean("lid",PersonService.class);
           personService1.printPersonList();
    }
}
