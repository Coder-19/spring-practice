package com.practice.springAnnotations;

// the code below is used to create a class to give daily workout details and daily fortunes to the baseball
// players by overriding the signature of the method present inside the coach interface

import org.springframework.stereotype.Component;

// the code below is to use the @Component annotation to register this class as a spring bean
@Component    // here since we are giving no bean id as input to the @Component annotation so the spring will take the name of the class with first letter being smaller as the bean id for this class
public class BaseballCoach implements Coach{

    // the code below is used to override the signature of the method present in the coach interface to give daily
    // workout details to the football players
    @Override
    public String giveDailyWorkoutDetails() {
        return "Do batting practice";
    }


    // the code below is used to override the signature of the method present in the coach interface to give daily
    // fortunes to the baseball players
    @Override
    public String giveDailyFortunes() {
        return null;
    }
}
