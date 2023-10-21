package org.examples.patterns.singleton;

import org.example.patterns.singleton.Singleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest{

    @Test
    public void singleObjectCreationTest(){
        //Create a singleton object
        Singleton singleton = Singleton.getInstance();
        //Start a thread which will call Singleton.getInstance multiple time and check if all objects are same or not.
        new Thread(()->{
            for(int i =0; i < 1000; i++){
                 Assertions.assertEquals(Singleton.getInstance(), singleton);
            }
        }).start();

    }
}