package com.company.Singleton;
/*
- we should have only one instance of a particular class
Example - Loggers, DB Connections,
- Classes that are sharing common resource at the end. !
- Or Classes that don't have any state at all. !
No state - No Fields / No Attributes
 */
public class Singleton {

    //private static Singleton instance = null;
    private static final Singleton instance = new Singleton(); // you don't need if else in the code. **

    private Singleton(){

    }

    public static Singleton getInstance() {
       // if (instance == null) {
         //   instance= new Singleton();
        //}
        return instance;
    }
}
//SpringBoot case : it does this thing - early/eager loading **
// creates the object at the time of instantiation
//If we assign the variable in the class itself; constructor will be called at the application load time.!
//It can slow down start time of the application.
//========
// If else case -
//It would crate the instance when we need it

