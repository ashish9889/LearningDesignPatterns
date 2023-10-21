package org.example.patterns.singleton;

public class Singleton {

    //Create static INSTANCE variable to hold Singleton class object
    private static Singleton INSTANCE;

    //Make constructor private so that no one can access it from outside the class
    private Singleton(){
    }

    //Method to get Singleton class oject
    public Singleton getInstance(){
        //If INSTANCE is not yet created then create it
        if(INSTANCE == null){
            //First take lock on Singleton class so that no other thread can enter the critical section when one thread is already entered
            synchronized (Singleton.class){
                //Check again if INSTANCE is still null then create it
                if(INSTANCE == null) {
                    INSTANCE = new Singleton();
                }//End of Inner if block
            }//End of Synchronized block
        }//End of outer if block
        return INSTANCE;
    }
}