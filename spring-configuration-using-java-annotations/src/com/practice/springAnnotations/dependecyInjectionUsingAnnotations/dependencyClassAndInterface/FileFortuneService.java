package com.practice.springAnnotations.dependecyInjectionUsingAnnotations.dependencyClassAndInterface;

// the code below is used to create a class to give daily fortunes to the players of different sports by overriding
// the signature of method present in the FortuneService interface and by reading the fortunes from a file

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

// the code below is to use the @Component annotation to scan the class and register it as a spring bean
@Component
@Scope("singleton")     // using the @Scope annotation make the scope of the class below as singleton
public class FileFortuneService implements FortuneService{

    // the code below is used to create an ArrayList to store the data that we have read from the file
    ArrayList<String> fortunesList = new ArrayList<String>();

    // the code below is used to create a property of type file to read the fortunes.txt file into the class
    File file = new File("/home/jasman/Desktop/my_files_and_folders/my_projects/projects_pushed_to_github/spring-practice/spring-configuration-using-java-annotations/src/fortunes.txt");

    // the code below is used to create an instance of the random class for getting the random number based on
    // the length of the fortuneList
    Random random = new Random();


    // NOTE: the step below can be done using the default no-argument constructor also

    // the code below is used to create a custom init-method using the @PostConstruct annotation
    @PostConstruct
    public void customInitMethod(){
        // using the try catch exception handling to read the data from the file and if the txt file is not
        // empty then adding the data from the txt file to the fortuneList

        // the code below is used to read the data from the file using the buffered reader and File reader by passing
        // the path of the txt file as input to the file reader instance
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            // the code below is used to check that if the br is ready then reading the data from the br using
            // the readLine() method and then adding that data to the fortuneList()
            while (br.ready()){
                // the code below is used to read the data from the txt file line by line using the readLine()
                // method and then adding it to the fortuneList array
                fortunesList.add(br.readLine());
            }
        } catch (Exception e){
            // the below line of code is for debugging purpose
            System.out.println("The error while reading the data from the file is: "+e);
        }
    }


    // the code below is used to override the signature of method present in the fortune service interface to
    // give daily fortunes to the players of different sports
    @Override
    public String giveDailyFortunes() {

        // the code below is used to get a random integer using the random instance of the Random class according to
        // the length of the fortuneList
        int randomIndex = random.nextInt(fortunesList.size());   // here the size() method is used to return the
        // length of the fortuneList

        // the below line of code is for debugging purpose
        System.out.println("The random index is: "+randomIndex);

        // the code below is used to return the string from the fortuneList based on the randomIndex using the get()
        // method
        return fortunesList.get(randomIndex);
    }
}
