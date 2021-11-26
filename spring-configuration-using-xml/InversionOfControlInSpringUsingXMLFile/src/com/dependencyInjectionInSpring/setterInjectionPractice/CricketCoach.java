package com.dependencyInjectionInSpring.setterInjectionPractice;

import com.dependencyInjectionInSpring.dependencyInterfaceAndClass.FortuneService;
import com.inversionOfControl.sports.Coach;

// the code below is used to create a cricket coach class for giving the daily workout details and daily fortunes
// to the cricket player using the signature of the method present inside the coach interface
public class CricketCoach implements Coach {
    // the code below is used create a private field for the FortuneService interface for doing dependency injection
    // using setter injection for giving daily fortunes to the cricket players
    private FortuneService fortuneService;
    
    
    // the code below is used to create a property to get the name of the team
    private String teamName;
    
    // the code below is used to create a property for getting the email address of the coach
    private String coachEmailAddress;

    // the code below is used to create a no-argument constructor for the CricketCoach class
    public CricketCoach(){
        // the below line of code is for debugging purpose
        System.out.println("Cricket Coach: Inside no-arguments constructor");
    }

    // the code below is used to create a setter for doing dependency injection using the setter injection for
    // giving daily fortunes to the cricket Players

    // the setter below takes a variable of type FortuneService interface for doing dependency injection using
    // setter injection for giving daily fortunes to the cricket players
    public void setFortuneService(FortuneService theFortuneService){
        // the below line of code is for debugging purpose
        System.out.println("CricketCoach: Inside setFortuneService setter");

        // the code below is used to set the value of the fortuneService equal to the value of theFortuneService
        fortuneService = theFortuneService;
    }
    
    
    // the code below is used to create the setter for setting the teamName
    public void setTeamName(String cricketTeamName) {
    	teamName = cricketTeamName;
    }
    
    // the code below is used to create a getter for getting the teamName
    public String getTeamName() {
    	return "The Name of the team is "+teamName;
    }
    
    // the code below is used to create a setter for setting the email address of the coach
    public void setCoachEmailAddress(String  emailAddress) {
    	this.coachEmailAddress = emailAddress;
    }
    
    // the code below is used to create a getter for getting the email address of the coach
    public String getCoachEmailAddress() {
    	return coachEmailAddress;
    }
    

    // the code below is used to create a method for giving the daily workout to the cricket players
    @Override
    public String getDailyWorkoutDetails() {
        return "Practice bowling for 15 minutes daily";
    }


    // the code below is used to create a method to give daily fortunes to the cricket players by using setter
    // injection
    @Override
    public String getDailyFortuneDetails() {
        // the code below is used to give daily fortunes to the cricket players using the instance of the
        // fortuneService interface
        return fortuneService.getDailyFortune();
    }

}
