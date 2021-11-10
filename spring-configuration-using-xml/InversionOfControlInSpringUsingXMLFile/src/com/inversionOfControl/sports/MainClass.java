package com.inversionOfControl.sports;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// the code below is used to create a main class for the project
public class MainClass {
	public static void main(String[] args) {
		// the code below is used to create an instance of the baseball coach
		// Coach theCoach = new BaseballCoach();
		
		
		// the code below is used to create an instance of the track coach
		// Coach theCoach = new TrackCoach();
		
		// the code below is used to print the daily workout details in the console
		// using the getDailyWorkout method
		// System.out.println(theCoach.getDailyWorkoutDetails());
		
		
		// the code below is used for initializing the spring container using ClassPathXmlApplicationContext
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// the code below is used to get access to the baseballCoach bean using the getBean method from
		// the spring 
		Coach theCoach = context.getBean("baseBallCoach", Coach.class);   // here the baseBallCoach 
		// is the id or the alias that is used to create an object of the BaseballCoach class and the 
		// Coach is the name of the interface
		
		// the below line of code is used to access the getDailyWorkoutDetails() method from the baseballCoach 
		// and print the workout details in the console
		System.out.println(theCoach.getDailyWorkoutDetails());

		// the below line of code is used to access the getDailyFortuneDetails() method from the baseballCoach
		// class and print the daily fortunes in the console
		System.out.println("The daily fortunes for the baseball player is: "+theCoach.getDailyFortuneDetails());
		
		
		// the code below is used to get access to the trackCoach bean using the getBean method from the Spring
		Coach alphaCoach = context.getBean("trackCoach", Coach.class);   // here the trackCoach
		// is the id or the alias that is used to create an object of the TrackCoach class and the 
		// Coach is the name of the interface
		
		// the below line of code is used to access the getdailyWorkoutDetails() method from the trackcoach 
		// class and print it in the console
		System.out.println(alphaCoach.getDailyWorkoutDetails());

		// the code below is to use the getBean method for accessing the bean from the spring container
		Coach betaCoach = context.getBean("cricketCoach", Coach.class);   // here the cricketCoach
		// is the id or the alias that is used to create an object of the CricketCoach class and the
		// Coach is the name of the interface

		// the code below is used to print the daily workout of the cricket players
		System.out.println("Cricket Coach: "+betaCoach.getDailyWorkoutDetails());

		// the code below is used to print the daily fortunes for the cricket players
		System.out.println("Cricket Coach: "+betaCoach.getDailyFortuneDetails());

		
		// the code below is used to close the context
		context.close();
	}
}
