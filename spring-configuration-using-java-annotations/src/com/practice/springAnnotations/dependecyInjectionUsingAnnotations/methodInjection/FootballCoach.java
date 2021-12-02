package com.practice.springAnnotations.dependecyInjectionUsingAnnotations.methodInjection;

import com.practice.springAnnotations.Coach;
import com.practice.springAnnotations.dependecyInjectionUsingAnnotations.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// the code below is used to create the FootballCoach class for giving the daily workout details and daily fortunes
// to the Football Players by overriding the signature of the method present  in the Coach interface

// using the @Component annotation to register this class as a bean when the spring scans this class and register it as
// a spring bean
@Component
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
    @Autowired
    public void customMethodInjection(FortuneService theFortuneService){

        // the below line of code is for debugging purpose
        System.out.println("Football Coach: Inside customMethodInjection() method");

        // the code below is used to set the value of theFortuneService equal to the fortuneService
        fortuneService = theFortuneService;
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
}
