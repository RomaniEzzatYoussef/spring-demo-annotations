package com.romani.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        // load the spring configuration file
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // retrieve bean from spring container
        TennisCoachCoach tennisCoachCoach = applicationContext.getBean("tennisCoachCoach", TennisCoachCoach.class);

        System.out.println(tennisCoachCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(tennisCoachCoach.getDailyFortune());

        // close the context
        applicationContext.close();

    }
}
