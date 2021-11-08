package com.inversionOfControl.sports;

// the code below is used to  create a class to give daily workout details and the daily fortunes 
// from the track coach using the signature of the method present inside the Coach interface
public class TrackCoach implements Coach {
	
	// the code below is to override the signature of the method present in the coach interface
	// to give daily workout to the players
	@Override
	public String getDailyWorkoutDetails() {
		// the code below is used to return the String having the workout details for the players
		return "Run a hard 5K";
	}

	// the code below is used to override the signature of the method present in the coach interface to
	// give daily fortune to the players
	@Override
	public String getDailyFortuneDetails() {
		return null;
	}

}
