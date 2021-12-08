package com.practice.springAnnotations.dependecyInjectionUsingAnnotations.methodInjection;

import com.practice.springAnnotations.Coach;
import com.practice.springAnnotations.dependecyInjectionUsingAnnotations.dependencyClassAndInterface.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// the code below is used to create the FootballCoach class for giving the daily workout details and daily fortunes
// to the Football Players by overriding the signature of the method present  in the Coach interface

// using the @Component annotation to register this class as a bean when the spring scans this class and register it as
// a spring bean
@Component
@Scope("singleton")  // using the @Scope annotation to make the scope of this class as singleton
public class FootballCoach implements Coach {

    // the code below is used to create a private instance of the FortuneService interface for doing dependency
    // injection to give daily fortunes to the football players
    private FortuneService fortuneService;

    // the code below is used to create a no-argument constructor for this class
    public FootballCoach(){
        // the below line of code is for debugging purpose
        System.out.println("Football Coach: Inside no-argument constructor");
    }

    // the code below is used to create a method for doing method injection for giving daily fortunes to the
    // football players

    // the method below takes as instance of the FortuneService as input

    // the code below is to use the @Autowired annotation to help the spring to scan this project and find the
    // class that implements fortuneService interface and do dependency injection by using the giveDailyFortunes()
    // method to give daily fortunes to the football players

    // the code below is to use the @Qualifier annotation and passing the bean id of the spring component from which
    // we want to use the getDailyFortune to give daily fortunes to our football players
    @Autowired
    public void customMethodInjection(@Qualifier("randomFortuneService") FortuneService theFortuneService){

        // the below line of code is for debugging purpose
        System.out.println("Football Coach: Inside customMethodInjection() method");

        // the code below is used to set the value of theFortuneService equal to the fortuneService
        fortuneService = theFortuneService;
    }

    // the code below is to use the @PostConstruct annotation to create a custom init-method
    @PostConstruct
    public void customInitMethod(){
        // the below line of code is for debugging purpose
        System.out.println("FootballCoach: Inside customInitMethod() ");
    }

    // the code below is used to override the signature of method to give  daily workout details to the football players
    @Override
    public String giveDailyWorkoutDetails() {
        return "Do Goaling Practice";
    }

    // the code below is used to override the signature of method to give daily fortunes to the football players
    @Override
    public String giveDailyFortunes() {
        // the code below is to use the method defined in the class associated with the FortuneService interface
        // to give daily fortunes to the Football players
        return fortuneService.giveDailyFortunes();
    }

    // the code below is to use the @PreDestroy annotation to create a custom Destroy method
    @PreDestroy
    public void customDestroy(){
        // the below line of code is for debugging purpose
        System.out.println("FootballCoach: Inside customDestroy() method");
    }
}
