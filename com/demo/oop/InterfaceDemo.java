package com.demo.oop;

// can only be public or default
public interface InterfaceDemo {

    // All variables in Interface are public,static final by default
    public String new_variable = "";
    public static final String MY_VARIABLE_2 = "";

    static String myMethod(){
        return "";
    }


    // Cannot have constructors
//    public InterfaceDemo(){
//
//    }


    // All methods are abstract/public by default
    String getType();

    // Default methods introduced after Java 9

    default String getDefaultType(){
        return "this is default";
    }


    // Private functions should have a body // Protected not allowed
    // Mostly used in default or static methods
    private String getPrivateDefaultType(){
        return MY_VARIABLE_2 + new_variable;
    }
}
