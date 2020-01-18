package com.romani.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


// @Component("tennisCoach") // is an Explicit bean-id
@Component // is a implicit bean-id that equal to name of class with first letter in lower-case
@Scope("singleton") // the default scope is the singleton // prototype ==> create new instance every time
public class TennisCoachCoach implements Coach {

    // Field Injection
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;
//
//    // define a default constructor
//    public TennisCoachCoach() {
//        System.out.println(">> TennisCoach: inside default constructor ");
//    }

    //     Constructor Injection
    @Autowired
    public TennisCoachCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }


    // Setter Injection
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println(">> TennisCoach: inside Method: setFortuneService");
//
//        this.fortuneService = fortuneService;
//    }
//
    // Method Injection
//    @Autowired
//    public void doSomeCrazyStuff(FortuneService fortuneService) {
//        System.out.println(">> TennisCoach: inside Method: doSomeCrazyStuff");
//
//        this.fortuneService = fortuneService;
//    }


    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
