package com.practice.springAnnotations.dependecyInjectionUsingAnnotations.fieldInjection;

// the code below is used to create the basketballCoach class for giving the daily workout details and daily fortunes
// to the Football Players by overriding the signature of the method present  in the Coach interface

import com.practice.springAnnotations.Coach;
import com.practice.springAnnotations.dependecyInjectionUsingAnnotations.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// using the @Component annotation to register this class as a bean when the spring scans this class and register it as
// a spring bean
@Component
public class BasketballCoach implements Coach {

    // the code below is used to create a private instance of the FortuneService interface for doing dependency
    // injection using field injection to give daily fortunes to the Basketball players

    // NOTE: Field injection using the Reflection java technology behind the scenes

    // the code below is to use the @Autowired annotation to help the spring to scan this project and find the
    // class that implements fortuneService interface and do dependency injection by using the giveDailyFortunes()
    // method to give daily fortunes to the basketball players
    @Autowired
    private FortuneService fortuneService;

    // the code below is used to override the signature of method to give  daily workout details to the Basketball players
    @Override
    public String giveDailyWorkoutDetails() {
        return "Run a hard 5K";
    }

    // the code below is used to override the signature of method to give daily fortunes to the Basketball players
    @Override
    public String giveDailyFortunes() {
        // the code below is to use the method defined in the class associated with the FortuneService interface
        // to give daily fortunes to the basket players
        return fortuneService.giveDailyFortunes();
    }
}
