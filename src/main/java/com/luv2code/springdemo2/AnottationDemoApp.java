package com.luv2code.springdemo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnottationDemoApp {
    
    public static void main(String[] args) {
        
        // read the spring configuration file 
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // get the bean from springcontainer 

        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // call method on the bean

        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        // close the context 

        context.close();
    }
}
