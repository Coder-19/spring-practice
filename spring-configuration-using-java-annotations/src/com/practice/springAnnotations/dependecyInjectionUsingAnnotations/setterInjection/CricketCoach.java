package com.practice.springAnnotations.dependecyInjectionUsingAnnotations.setterInjection;

import com.practice.springAnnotations.Coach;
import com.practice.springAnnotations.dependecyInjectionUsingAnnotations.dependencyClassAndInterface.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// the code below is used to create a class for giving daily workout details ad daily fortunes to the cricket players
// by overriding the signature of the method present in the Coach interface

// the code below is to use the @Component annotation so as when the spring will scan this class then it will
// register it as a bean
@Component
@Scope("prototype")   // using the @Scope annotation to make the scope of this class as prototype
public class CricketCoach implements Coach {

    // the code below is used to create a private instance of the FortuneService to give daily fortunes to the
    // Cricket players using dependency injection
    private FortuneService fortuneService;

    // the code below is used to create a no-argument constructor for the class
    public CricketCoach(){
        // the below line of code is for debugging purpose
        System.out.println("Cricket Coach: Inside no-argument constructor");
    }

    // the code below is used to create a setter for doing dependency injection using setter injection
    // to give daily fortunes to the cricket players

    // the setter below takes an instance of the FortuneService as input

    // the code below is to use the @Autowired annotation to help the spring to scan this project and find the
    // class that implements fortuneService interface and do dependency injection by using the giveDailyFortunes()
    // method to give daily fortunes to the tennis players

    // the code below is to use the @Qualifier annotation and passing the bean id of the spring component from which
    // we want to use the getDailyFortune to give daily fortunes to our cricket players
    @Autowired
    public void setFortuneService(@Qualifier("fileFortuneService") FortuneService theFortuneService){

        // the below line of code is for debugging purpose
        System.out.println("Cricket Coach: Inside the SetFortuneService setter");

        // the code below is used to set the value of the theFortuneService equal to the fortuneService
        fortuneService = theFortuneService;

    }

    // the code below is used to override the signature of the method in the Coach interface to give daily workout
    // details to the Cricket players
    @Override
    public String giveDailyWorkoutDetails() {
        return "Do bowling practice";
    }

    // the code below is to override the signature of the method in the Coach interface to give daily Fortunes
    // to the Cricket Players
    @Override
    public String giveDailyFortunes() {
        // the code below is to use the method defined in the class associated with the FortuneService interface
        // to give daily fortunes to the Cricket players
        return fortuneService.giveDailyFortunes();
    }
}
