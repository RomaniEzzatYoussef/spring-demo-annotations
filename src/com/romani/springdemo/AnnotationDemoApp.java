package com.romani.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // retrieve bean from spring container
        Coach tennisCoach = applicationContext.getBean("tennisCoachCoach", Coach.class);

        System.out.println(tennisCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(tennisCoach.getDailyFortune());

        // close the context
        applicationContext.close();

    }
}
