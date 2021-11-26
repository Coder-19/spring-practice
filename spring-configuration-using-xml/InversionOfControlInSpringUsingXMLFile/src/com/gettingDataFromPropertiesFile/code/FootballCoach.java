package com.gettingDataFromPropertiesFile.code;

import com.dependencyInjectionInSpring.dependencyInterfaceAndClass.FortuneService;
import com.inversionOfControl.sports.Coach;

//the code below is used to create a class for giving the daily workout details and daily fortunes
//to the football players using the signature of the method present in the Coach interface 
public class FootballCoach implements Coach{
	
	// the code below is used to create an instance of the HappyFortuneService to do dependency 
	// injection to give daily fortunes to the Football players using the methods defined in 
	// the HappyFortuneService class
	private FortuneService fortuneService;
	
	// the code below is used to create the private instance to get the team Name for the football
	// team
	private String footballTeamName;
	
	// the code below is used to create a private instance to get the coach email address for the
	// football coach
	private String footballCoachEmailAddress;
	
	
	// the code below is used to create a no-argument  constructor for this class
	public FootballCoach() {
		// the below line of code is for debugging purpose
		System.out.println("Football Coach: Inside no-argument constructor");
	}
	
	// the code below is used to create a setter for doing setter injection to give daily fortunes
	// to the football players
	
	// the setter below takes the instance of FortuneService as an input
	public void setFortuneService(FortuneService theFortuneService) {
		// the below line of code is for debugging purpose
		System.out.println("Football Coach: Inside FortuneService Setter");
		
		// the below line of code is used to set the value of the fortuneService equal to the 
		// theFortuneService
		fortuneService = theFortuneService;
	}
	
	// the code below is used to create a setter for setting the football team name
	public void setFootballTeamName(String teamName) {
		this.footballTeamName = teamName;
	}
	
	// the code below is used to create a getter for getting the football team Name
	public String getTeamName() {
		return footballTeamName;
	}
	
	// the code below is used to create a setter for setting the email address of the coach
	public void setCoachEmailAddress(String email) {
		this.footballCoachEmailAddress = email;
	}
	
	// the code below is used to create a getter for getting the email address of the coach
	public String getCoachEmailAddress() {
		return footballCoachEmailAddress;
	}

	// the code below is used to override the signature of the method to give daily workout details
	// to the football players
	@Override
	public String getDailyWorkoutDetails() {
		return "Run Daily";
	}

	// the code below is used to override the signature of the method to give daily fortunes to the 
	// football players using the dependency or helper class happy fortune service
	@Override
	public String getDailyFortuneDetails() {
		// the code below is to use the instance of the fortune service to give daily fortunes
		// to the football players using setter dependency injection
		return fortuneService.getDailyFortune();
	}

}
