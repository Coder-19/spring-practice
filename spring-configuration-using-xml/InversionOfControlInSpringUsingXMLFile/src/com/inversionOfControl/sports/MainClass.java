package com.inversionOfControl.sports;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.dependencyInjectionInSpring.setterInjectionPractice.CricketCoach;
import com.gettingDataFromPropertiesFile.code.FootballCoach;

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
		CricketCoach betaCoach = context.getBean("cricketCoach", CricketCoach.class);   // here the cricketCoach
		// is the id or the alias that is used to create an object of the CricketCoach class and the
		// CricketCoach is the name of the interface

		// the code below is used to print the daily workout of the cricket players
		System.out.println("Cricket Coach: "+betaCoach.getDailyWorkoutDetails());

		// the code below is used to print the daily fortunes for the cricket players
		System.out.println("Cricket Coach: "+betaCoach.getDailyFortuneDetails());
		
		// the code below is used to print the name of the cricket team  using the getter method defined 
		// in the cricketCoach class
		System.out.println("Cricket Coach: "+betaCoach.getTeamName());
		
		// the code below is used to print the email address of the coach using the getter method defined
		// in the cricketCoach class
		System.out.println("Cricket Coach: "+betaCoach.getCoachEmailAddress());
		
		
		// the code below is used to get access to the football coach  using getBean from spring
		FootballCoach gamaCoach = context.getBean("goodCoach", FootballCoach.class);   // here the goodCoach
		// is the id or the alias that is used to create an object of the FootballCoach class and the
		// FootballCoach is the name of the interface
		
		// the code below is used to print the daily workout of the football players
		System.out.println("Football Coach: "+gamaCoach.getDailyWorkoutDetails());

		// the code below is used to print the daily fortunes for the football players
		System.out.println("Football Coach: "+gamaCoach.getDailyFortuneDetails());
		
		// the code below is used to print the name of the football team  using the getter method defined 
		// in the footballCoach class
		System.out.println("Football Coach: "+gamaCoach.getTeamName());
		
		// the code below is used to print the email address of the coach using the getter method defined
		// in the footballCoach class
		System.out.println("Football Coach: "+gamaCoach.getCoachEmailAddress());
		
		// the code below is used to get access to the TennisCoach using the getBean from the spring
		Coach thetaCoach = context.getBean("tennisCoach", Coach.class);  // here the tennisCoach
		// is the id or the alias that is used to create an object of the tennisCoach class and the
		// Coach is the name of the interface
		
		// the code below is used to print the daily workout of the tennis players
		System.out.println("Tennis Coach: "+thetaCoach.getDailyWorkoutDetails());

		// the code below is used to print the daily fortunes for the tennis players
		System.out.println("Tennis Coach: "+thetaCoach.getDailyFortuneDetails());


		
		// the code below is used to close the context
		context.close();
	}
}
