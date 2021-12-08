package com.practice.springAnnotations.dependecyInjectionUsingAnnotations.dependencyClassAndInterface;

// the code below is used to create a dependency / helper class to override the signature of method present in the FortuneService
// interface to give daily fortunes to the players of different sports by dependency injection

import org.springframework.stereotype.Component;

// the code below is to use the @Component annotation to help the Spring to scan this class and register it as
// a spring bean
@Component    
public class HappyFortuneService implements FortuneService{

    // the code below is used to override the signature of the method to give daily fortunes to the players of
    // different sports by doing dependency injection
    @Override
    public String giveDailyFortunes() {
        return "Today is your lucky day";
    }
}
