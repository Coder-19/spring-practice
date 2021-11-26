package com.dependencyInjectionInSpring.dependencyInterfaceAndClass;

import java.util.Random;

// the code below is used to create a class for giving random  fortunes to the players of different
// sports
public class RandomFortuneService implements FortuneService{

	// the code below is used to create an array to store the list of fortunes for the players
	String[] fortuneList = {
		"Today is a happy day",
		"Beware of the wolf in Sheep",
		"Good things are waiting for you",
	};
	
	// the code below is used to create an object of the random class
	Random rand = new Random();
	
	@Override
	public String getDailyFortune() {
		// the code below is used to create a variable to store a random number generated using the 
		// rand object of the random class
		int num = rand.nextInt(2);
		// the code below is used to return the data from the fortune list array at index num
		return fortuneList[num];
	}

}
