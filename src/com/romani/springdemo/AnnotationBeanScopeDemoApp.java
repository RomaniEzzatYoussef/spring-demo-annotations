package com.romani.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        // load spring configuration file
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // retrieve bean from spring container
        TennisCoachCoach tennisCoachCoach1 = applicationContext.getBean("tennisCoachCoach", TennisCoachCoach.class);
        TennisCoachCoach tennisCoachCoach2 = applicationContext.getBean("tennisCoachCoach", TennisCoachCoach.class);

        // check if they are the same
        boolean result = (tennisCoachCoach1 == tennisCoachCoach2);

        // print out the results
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for tennisCoach1: " + tennisCoachCoach1);
        System.out.println("\nMemory location for tennisCoach2: " + tennisCoachCoach2);

        // close the context
        applicationContext.close();
    }

}
