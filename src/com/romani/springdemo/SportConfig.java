package com.romani.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.romani.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    // define a bean for our sadFortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // define bean for our swim coach And inject dependency
    @Bean
    public Coach swimimCoach(){
        return new SwimimCoach(sadFortuneService());
    }
}
