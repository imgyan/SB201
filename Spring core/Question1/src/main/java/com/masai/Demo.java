package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        
        MessageProcessorImpl messageProcessor  = ctx.getBean("messageProcessorImpl", MessageProcessorImpl.class);
                      messageProcessor.processMessage("calling twitter send");

        ( (AnnotationConfigApplicationContext)ctx).close();
    }
}
