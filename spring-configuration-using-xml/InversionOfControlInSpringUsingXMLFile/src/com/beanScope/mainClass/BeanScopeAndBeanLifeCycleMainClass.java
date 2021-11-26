package com.beanScope.mainClass;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.inversionOfControl.sports.Coach;

// the code below is used to create a class for showing bean scope in spring
public class BeanScopeAndBeanLifeCycleMainClass {
	
	// the code below is used to create the main method
	public static void main(String[] args) {
		
		// the code below is to use the classPathXMLApplicationContext to load the spring container
		// in our main class
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

		// the code below is used to create an instance of the BaseballCoach using the getBean() 
		// method
		Coach alphaCoach = context.getBean("baseBallCoach", Coach.class);  // here the baseBallCoach
		// is the name of the id for the bean and the Coach is the name of the interface
		
		// the code below is used to create an instance of the BaseballCoach using the getBean()
		// method
		Coach betaCoach = context.getBean("baseBallCoach", Coach.class);   // here the baseBallCoach
		// is the name of the id for the bean and the Coach is the name of the interface

		
		// the code below used to print the memory address of the alphaCoach
		System.out.println("The memory address of the alphaCoach is: "+alphaCoach);
		
		// the code below is used to print the memory address of the betaCoach
		System.out.println("The memory address of the betaCoach is: "+betaCoach);
		
		// the code below is used to check that whether the memory addresses share same location 
		// or not by checking that whether the memory addresses are same or not
		boolean isSame = (alphaCoach == betaCoach);
		
		System.out.println("The alphaCoach and betaCoach have same memory allocation: "+isSame);
		
		
		// the code below is used to create an instance of the trackcoach using the getBean()
		// method
		Coach deltaCoach = context.getBean("trackCoach", Coach.class);    // here the trackCoach
		// is the name of the id for the bean and the Coach is the name of the interface
		
		// the code below is used to create an instance of the trackcoach using the getBean()
		// method
		Coach thetaCoach = context.getBean("trackCoach", Coach.class);    // here the trackCoach
		// is the name of the id for the bean and the Coach is the name of the interface
		
		// the code below is used to print the memory address of the delta Coach
		System.out.println("The memory address of the deltaCoach is: "+deltaCoach);
		
		// the code below is used to print the memory address of the thetaCoach
		System.out.println("The memory address of the thetaCoach is: "+thetaCoach);
		
		// the code below is used to check that whether the memory address of the deltaCoach and thetaCoach
		// share the same memory location or not by checking that whether the memory address are same or not
		boolean same = (deltaCoach == thetaCoach);
		
		System.out.println("The deltaCoach and thetaCoach have same memory allocation: "+same);
				
		// the code below is used to close the context
		context.close();
	}

}
