package com.romani.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp
{
    public static void main(String[] args) {
        // load spring configuration file
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // retrieve bean from spring container
//        SwimCoach crickedCoach = applicationContext.getBean("swimCoach", SwimCoach.class);
        CrickedCoach crickedCoach = applicationContext.getBean("crickedCoach", CrickedCoach.class);

        // call methods on the bean
        System.out.println(crickedCoach.getDailyWorkout());
        System.out.println(crickedCoach.getDailyFortune());

        // let's call our new method for fortunes
        System.out.println(crickedCoach.getEmail());
        System.out.println(crickedCoach.getTeam());

        // close the context
        applicationContext.close();
    }
}
