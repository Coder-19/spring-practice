package com.practice.springAnnotations.dependecyInjectionUsingAnnotations.dependencyClassAndInterface;

// the code below is used to create a class to give daily random fortunes to  the players of different sports
// by overriding the signature of the method present in the FortuneService interface

import org.springframework.stereotype.Component;
import java.util.Random;

// the code below is to use the @Component annotation to let the spring scan this class and register it as a spring
// bean
@Component
public class RandomFortuneService implements FortuneService{

    // the code below is used to create an array of strings that contains the list of fortunes for the players
    // of different sports
    private String[] fortuneList = {
            "Today is a happy day",
            "Beware of the wolf in sheep face",
            "Good things are waiting for you",
    };

    // the code below is used to create an instance of the random class
    private Random random = new Random();

    // the code below is used to override the signature of the method present in the FortuneService interface
    // to give daily random fortunes to the players of different sports
    @Override
    public String giveDailyFortunes() {
        // the code below is used to create a variable to store a random number of integer type between 0 and 2
        int value = random.nextInt(2);
        // the code below is used to return an element from the fortuneList array from a randomIndex
        return fortuneList[value];
    }
}
