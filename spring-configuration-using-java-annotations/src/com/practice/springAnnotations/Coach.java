package com.practice.springAnnotations;

// the code below is used to create a coach interface for our project to create the signatures
// of the methods to give daily workout and daily fortunes to the players of different sports
public interface Coach {
	
	// the code below is used to create the signature of the method to give daily workout
	// to the players of different sports
    public String giveDailyWorkoutDetails();

    // the code below is used to create the signature of the method to give daily fortunes to the players
    // of different sports
    public String giveDailyFortunes();

}
