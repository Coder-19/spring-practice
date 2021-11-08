package com.dependencyInjectionInSpring.constructorInjectionPractice;

// the code below is used to create a class for giving the daily workout details and the daily
// fortunes to the Baseball players

import com.dependencyInjectionInSpring.dependencyInterfaceAndClass.FortuneService;
import com.inversionOfControl.sports.Coach;

// using the Coach interface to give daily workout and daily fortunes to the players of the baseball
// sport
public class BaseballCoach implements Coach {

	// the code below is used to create a private field for getting the dependency for giving daily fortunes to
	// the baseball players
	private FortuneService fortuneService;

	// the code below is used to create a constructor for doing the dependency injection using constructor
	// injection to give daily fortunes to the baseball players

	// the constructor below takes an instance of the FortuneService interface as input
	public BaseballCoach(FortuneService theFortuneService){
		// the below line of code is for debugging purpose
		System.out.println("Baseball Coach: Inside the BaseballCoach constructor");

		// the code below is used to set the value of the theFortuneService equal to the fortuneService
		fortuneService = theFortuneService;
	}


	// the code below is used to create a method to give daily workout details to the baseball
	// players
//	public String getDailyWorkout() {
		// the code below is used to return the string having the workout details for the baseball
		// players
//		return "Spend 30 minutes on Batting practice";
//	}
	
	
	
	// the code below is used to override the signature of the method present inside the Coach 
	// interface to give daily workout details to the players of the baseball sport
	@Override
	public String getDailyWorkoutDetails() {
		// the code below is used to return the string having the workout details for the baseball
		// players
		return "Spend 30 minutes on Batting practice";
	}

	// the code below is used to override the signature of the method present in the coach interface to
	// give daily fortune to the baseball players
	@Override
	public String getDailyFortuneDetails() {
		// the code below is to use the fortuneService instance to call the getDailyFortune() method
		// for giving daily fortunes to the baseball players
		return fortuneService.getDailyFortune();
	}


}
