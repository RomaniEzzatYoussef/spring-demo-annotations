package com.romani.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimimJavaConfigApp {

    public static void main(String[] args) {

        // load the spring configuration file
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // retrieve bean from spring container
        SwimimCoach swimimCoach = applicationContext.getBean("swimimCoach", SwimimCoach.class);

        // call a method on the bean
        System.out.println(swimimCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(swimimCoach.getDailyFortune());

        // call our new swimim coach methods ... has the props values injected
        System.out.println("email: " + swimimCoach.getEmail());
        System.out.println("team: " + swimimCoach.getTeam());

        // close the context
        applicationContext.close();
    }
}
