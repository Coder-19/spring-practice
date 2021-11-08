package com.inversionOfControl.sports;

// the code below is used to create a class for giving the daily workout details and the daily
// fortunes to the Baseball players

// using the Coach interface to give daily workout and daily fortunes to the players of the baseball
// sport
public class BaseballCoach implements Coach{
	
//	// the code below is used to create a method to give daily workout details to the baseball
//	// players
//	public String getDailyWorkout() {
//		// the code below is used to return the string having the workout details for the baseball
//		// players
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
	

}
