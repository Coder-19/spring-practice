package com.practice.springAnnotations.dependecyInjectionUsingAnnotations.constructorInjection;

// the code below is used to create the TennisCoach class to give daily workout details and daily fortunes to
// the tennis players using the signature of methods defined in the Coach interface

import com.practice.springAnnotations.Coach;
import com.practice.springAnnotations.dependecyInjectionUsingAnnotations.dependencyClassAndInterface.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// the code below is to use the @Component annotation for helping the spring to scan the class and register it as
// a spring bean
@Component("tennisCoachComponent")   // here we are giving an id as input to the component annotation
public class TennisCoach implements Coach {

    // the code below is used to create a private field of type FortuneService to give daily fortunes to the
    // tennis players by doing dependency injection
    private FortuneService fortuneService;

    // the code below is used to create a constructor for doing dependency injection using constructor
    // injection to give daily fortunes to the tennis players

    // the constructor below takes an instance of the FortuneService as input

    // the code below is to use the @Autowired annotation to help the spring to scan this project and find the
    // class that implements fortuneService interface and do dependency injection by using the giveDailyFortunes()
    // method to give daily fortunes to the tennis players

    // the code below is to use the @Qualifier annotation and passing the bean id of the spring component from which
    // we want to use the getDailyFortune to give daily fortunes to our tennis players
    @Autowired
    public TennisCoach(@Qualifier("happyFortuneService") FortuneService theFortuneService){

        // the below line of code is for debugging purpose
        System.out.println("Tennis Coach: Inside the Tennis Coach constructor");

        // the code below is used to set the value of the theFortuneService equal to the fortuneService
        fortuneService = theFortuneService;
    }

    // the code below is used to override the signature of the method defined in the Coach interface to
    // give daily workout details for the tennis players
    @Override
    public String giveDailyWorkoutDetails() {
        return "Practice your backhand volley";
    }

    // the code below is used to override the signature of the method defined in the Coach interface to
    // give daily fortunes to the tennis players
    @Override
    public String giveDailyFortunes() {
        // the code below is to use the method defined in the class associated with the FortuneService interface
        // to give daily fortunes to the tennis players
        return fortuneService.giveDailyFortunes();
    }
}
