package com.demo.oop;

public class MarkerClassDemo implements MarkerInterfaceDemo{
    public static void main(String[] args){
        MarkerInterfaceDemo b = new MarkerClassDemo();
        if(b instanceof MarkerInterfaceDemo){
            System.out.println("do something");
        }
    }
}
