package com.dependencyInjectionInSpring.dependencyInterfaceAndClass;

// the code below is used to create a dependency or the helper class to give daily fortunes to the players of
// the different sports by using the signature of the method present in the FortuneService interface
public class HappyFortuneService implements FortuneService{

    // the code below is to override the getDailyFortune() method present in the FortuneService interface to
    // give fortunes to the players of different sports
    @Override
    public String getDailyFortune(){
        // the code below is used to return the string having the daily fortunes for the players of different
        // sports
        return "Today is your Lucky day";
    }
}
