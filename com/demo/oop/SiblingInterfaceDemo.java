package com.demo.oop;

public interface SiblingInterfaceDemo {

    String new_variable = "";

    // will cause clash with sibling Interface if used together
    // because of different return type(signature)
//    void getType();

    default String getDefaultType(){
        return "this is default";
    }

}
