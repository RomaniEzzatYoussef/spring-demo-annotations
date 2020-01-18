package com.romani.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SwimCoach implements Coach {

    @Qualifier("randomFortuneService")
    @Autowired
    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public SwimCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
//
//    // define my init method
//    @PostConstruct
//    public void doMyStartupStuff() {
//        System.out.println(">> SwimCoach: inside PostConstruct doMyStartupStuff ");
//    }
//
//    // define my destroy method
//    @PreDestroy
//    public void doMyCleanupStuff() {
//        System.out.println(">> SwimCoach: inside PreDestroy doMyCleanupStuff ");
//    }


}
