package com.demo.oop;

// No use unless instances are created
public abstract class AbstractDemo {

    public String new_variable = "";

    public static final String MY_VARIABLE_2 = "";

    static String myMethod(){
        return "";
    }


    // abstract class can have constructors but can't be instantiated
    public AbstractDemo(String name){

    }

    // if there is even 1 abstract method, classes must be abstract
    public abstract void abstractMethod();

    // normal method possible
    public void anyMethod(){

    }
}
