package com.randomFortunes.code;

import com.dependencyInjectionInSpring.dependencyInterfaceAndClass.RandomFortuneService;
import com.inversionOfControl.sports.Coach;

// the code below is used to create a class for giving daily fortunes and daily workout details to
// the tennis players by overriding the signature of the method present in the Coach interface
public class TennisCoach implements Coach{
	
	// the code below is used to create an instance of the RandomFortuneService to do dependency 
	// injection using constructor injection
	private RandomFortuneService randomFortuneService = new RandomFortuneService();
	
	// the code below is used to create a constructor for doing dependency injection using constructor
	// injection to give daily fortunes to the tennis players
	
	// the constructor below takes an instance of the RandomFortuneService as input
	public TennisCoach(RandomFortuneService theRandomFortuneSerivce) {
		
		// the below line of code is for debugging purpose
		System.out.println("Tennis Coach: Inside the TennisCoach Constructor");
		
		// the line of code below is used to set the value of the theRandomFortuneSerivce 
		// equal to the randomFortuneService
		randomFortuneService = theRandomFortuneSerivce;
	}
	
	
	// the code below is used to override the signature of the method inside the Coach interface 
	// to give daily workout details to the tennis players
	@Override
	public String getDailyWorkoutDetails() {
		return "Practice back-hand volley";
	}

	// the code below is used to override the signature of the method present inside the Coach 
	// interface to give daily fortunes to the tennis players
	@Override
	public String getDailyFortuneDetails() {
		return randomFortuneService.getDailyFortune();
	}

}
