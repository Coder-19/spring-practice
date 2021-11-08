package com.inversionOfControl.sports;

// the code below is used to create an interface to get the signature of the methods to give daily
// workout details and the daily fortunes to the players of different sports
public interface Coach {
	
	// the code below is used to create the signature of a method to give daily workout details
	// to the players of different sports
	public String getDailyWorkoutDetails();

	// the code below is used to create the signature of the method to give daily fortunes to the
	// players of different sports
	public String getDailyFortuneDetails();
}
