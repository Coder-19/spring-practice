package com.practice.springAnnotations;

import com.practice.springAnnotations.gettingDataFromPropertiesFile.TrackCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// the code below is used to create the main class for our project
public class MainClass {
	
	public static void main(String[] args) {

		// the code below is used to load the spring container into our project
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		// the code below is to use the getBean method to retrive the TennisCoach Bean from our spring container
		Coach alphaCoach = context.getBean("tennisCoachComponent", Coach.class);   // here the tennisCoachComponent
		// is the bean id for the TennisCoach class and the Coach is the name of our interface

		// the code below is used to print the daily workout details for our tennis players using the giveDailyWorkoutDetails()
		// method defined in the TennisCoach class
		System.out.println("Tennis Coach: "+alphaCoach.giveDailyWorkoutDetails());

		// the code below is used to print the daily fortunes provided by our coach for our tennis players
		System.out.println("Tennis Coach: "+alphaCoach.giveDailyFortunes());

		// the code below is to use the getBean method to retrive the baseballCoach Bean from our spring container
		Coach betaCoach = context.getBean("baseballCoach", Coach.class);   // here the baseballCoach
		// is the default bean id that the spring will create for the BaseballCoach class since we haven't created
		// a bean id and the Coach is the name of our interface

		// the code below is used to print the daily workout details for our baseball players using the giveDailyWorkoutDetails()
		// method defined in the BaseballCoach class
		System.out.println("Baseball Coach: "+betaCoach.giveDailyWorkoutDetails());

		// the code below is to use the getBean method to retrive the cricketCoach Bean from our spring container
		Coach gamaCoach = context.getBean("cricketCoach", Coach.class);   // here the cricketCoach
		// is the default bean id that the spring will create for the CricketCoach class since we haven't created
		// a bean id and the Coach is the name of our interface

		// the code below is used to print the daily workout details for our baseball players using the giveDailyWorkoutDetails()
		// method defined in the CricketCoach class
		System.out.println("Cricket Coach: "+gamaCoach.giveDailyWorkoutDetails());

		// the code below is used to print the daily fortunes provided by our coach for our Cricket players
		System.out.println("Cricket Coach: "+gamaCoach.giveDailyFortunes());


		// the code below is to use the getBean method to retrive the footballCoach Bean from our spring container
		Coach thetaCoach = context.getBean("footballCoach", Coach.class);   // here the footballCoach
		// is the default bean id that the spring will create for the footballCoach class since we haven't created
		// a bean id and the Coach is the name of our interface

		// the code below is used to print the daily workout details for our football players using the giveDailyWorkoutDetails()
		// method defined in the footballCoach class
		System.out.println("Football Coach: "+thetaCoach.giveDailyWorkoutDetails());

		// the code below is used to print the daily fortunes provided by our coach for our football players
		System.out.println("Football Coach: "+thetaCoach.giveDailyFortunes());

		// the code below is to use the getBean() method for retriving the basketballCoach Bean from our spring
		// container
		Coach deltaCoach = context.getBean("basketballCoach", Coach.class);   // here the basketballCoach
		// is the default bean id that the spring will create for the BasketballCoach class since we haven't created
		// a bean id and the Coach is the name of our interface

		// the code below is used to print the daily workout details for our basketball players using the giveDailyWorkoutDetails()
		// method defined in the BasketballCoach class
		System.out.println("Basketball Coach: "+deltaCoach.giveDailyWorkoutDetails());

		// the code below is used to print the daily fortunes provided by our coach for our basketball players
		System.out.println("Basketball Coach: "+deltaCoach.giveDailyFortunes());


		// the code below is to use the getBean() method for retriving the TrackCoach Bean from our spring
		// container
		TrackCoach fiCoach = context.getBean("trackCoach", TrackCoach.class);   // here the trackCoach
		// is the default bean id that the spring will create for the TrackCoach class since we haven't created
		// a bean id and the Coach is the name of our interface

		// the code below is used to print the daily workout details for our  players using the giveDailyWorkoutDetails()
		// method defined in the TrackCoach class
		System.out.println("Track Coach: "+fiCoach.giveDailyWorkoutDetails());

		// the code below is used to print the daily fortunes provided by our coach for our  players
		System.out.println("Track Coach: "+fiCoach.giveDailyFortunes());

		// the code below is used to print the teamName to the console
		System.out.println("Track Coach Team Name: "+fiCoach.getTeamName());

		// the code below is used to print the teamEmail address to the console
		System.out.println("Track Coach Team Email Address: "+fiCoach.getTeamEmailAddress());

		// the code below is used to close the context
		context.close();

	}

}
