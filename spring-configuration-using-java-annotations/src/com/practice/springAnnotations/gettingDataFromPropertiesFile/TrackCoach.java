package com.practice.springAnnotations.gettingDataFromPropertiesFile;

import com.practice.springAnnotations.Coach;
import com.practice.springAnnotations.dependecyInjectionUsingAnnotations.dependencyClassAndInterface.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// the code below is used to create a class for giving daily workout details and daily fortunes to the players by
// overriding the signature of the method present in the Coach interface

// using the @Component annotation to help the spring scan this class and register it as a bean
@Component
public class TrackCoach implements Coach {

    // the code below is used to create an instance of the FortuneService to give daily fortunes to the players
    // by doing dependency injection using method injection
    private FortuneService fortuneService;

    // the code below is used to create a private field to get the team Name

    // the code below is to use the @Value annotation and passing the name of the property as input so that the
    // spring will find the properties file and get the value for the property that we have entered as input for
    // the @value annotation
    @Value("${team.name}")
    private String teamName;


    // the code below is to create a private field to get the team email address

    // the code below is to use the @Value annotation and passing the name of the property as input so that the
    // spring will find the properties file and get the value for the property that we have entered as input for
    // the @value annotation
    @Value("${team.email}")
    private String teamEmailAddress;

    // the code below is to create a method to do dependency injection using method injection to give daily fortunes
    // to the players

    // the method below takes an instance of the FortuneService as input

    // using the @Autowired annotation to let the spring know that we are looking for a class implementing the
    // signatures of the methods defined in the fortuneService interface

    // the code below is to use the @Qualifier annotation to let the spring know from which class we want to use
    // the getFortune() method to give daily fortunes to our players
    @Autowired
    public void customMethodForDependencyInjection(@Qualifier("randomFortuneService") FortuneService theFortuneService){
        // the below line of code is for debugging purpose
        System.out.println("TrackCoach: Inside customMethodForDependencyInjection");

        // the code below is used to set the value of theFortuneService equal to the fortuneService
        fortuneService = theFortuneService;
    }

    // the code below is used to create a setter for setting the value of teamName
    public void setTeamName(String teamName){
        // the below line of code is for debugging purpose
        System.out.println("Track Coach: Inside setTeamName() setter method");

        this.teamName = teamName;
    }

    // the code below is used to create a getter for getting the team Name
    public String getTeamName(){
        return teamName;
    }

    // the code below is used to create a setter for setting the value of teamEmailAddress
    public  void setTeamEmailAddress(String teamEmailAddress){
        // the below line of code is for debugging purpose
        System.out.println("Track Coach: Inside setTeamEmailAddress() setter");

        this.teamEmailAddress  = teamEmailAddress;
    }

    // the code below is used to create a getter for getting the team email address
    public String getTeamEmailAddress(){
        return teamEmailAddress;
    }

    // the code below is used to override the signature of the method present in the Coach interface to give
    // daily workout details to the players
    @Override
    public String giveDailyWorkoutDetails() {
        return "Run a Hard 5K";
    }

    // the code below is used to override the signature of the method present in the Coach interface to give
    // daily fortunes to the players
    @Override
    public String giveDailyFortunes() {
        // the code below is to use the getDailyFortunes() method to give daily fortunes to the players
        return fortuneService.giveDailyFortunes();
    }
}
