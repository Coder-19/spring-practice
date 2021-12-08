package com.practice.springAnnotations.scopeAnnotation;

import com.practice.springAnnotations.Coach;
import com.practice.springAnnotations.dependecyInjectionUsingAnnotations.methodInjection.FootballCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// the code below is used to create the main class of the app
public class BeanScopeAndBeanLifecycleMainClass {

    // the code below is used to create the main method
    public static void main(String[] args){

        // the code below is used to load the application-context.xml file into our app
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        // the code below is used to retrive the cricketCoach bean into our main class using the getBean() method
        Coach alphaCoach = context.getBean("cricketCoach", Coach.class);

        // the code below is used to retrive the CricketCoach bean into our main class using the getBean() method
        Coach betaCoach = context.getBean("cricketCoach", Coach.class);

        // the code below is used to check that whether the alphaCoach and the betaCoach point to the same memory
        // location or not
        boolean same = (alphaCoach == betaCoach);

        // the below line of code is used to print the memory address of the alpha Coach
        System.out.println("The memory location of the alpha Coach is: "+alphaCoach);

        // the code below is used to print the memory address of the beta Coach
        System.out.println("The memory location of the beta Coach is: "+betaCoach);

        // the code below is used to print that whether the alphaCoach and the betaCoach share the same memory
        // location or not
        System.out.println("The alphaCoach and the betaCoach share same memory location: "+same);

        // the code below is used to retrive the footballCoach bean into our main class using the getBean() method
        FootballCoach gamaCoach = context.getBean("footballCoach", FootballCoach.class);

        // the code below is used to retrive the footballCoach bean into our main class using the getBean() method
        FootballCoach thetaCoach = context.getBean("footballCoach", FootballCoach.class);

        // the code below is used to check that whether the gamaCoach and the thetaCoach point to the same memory
        // location or not
        boolean isSame = (gamaCoach == thetaCoach);

        // the below line of code is used to print the memory address of the gama Coach
        System.out.println("The memory location of the gamaCoach is: "+gamaCoach);

        // the code below is used to print the memory address of the theta Coach
        System.out.println("The memory location of the theta Coach is: "+thetaCoach);

        // the code below is used to print that whether the gamaCoach and the thetaCoach share the same memory
        // location or not
        System.out.println("The gamaCoach and the thetaCoach share same memory location: "+isSame);



        // the code below is used to close the context
        context.close();
    }
}
