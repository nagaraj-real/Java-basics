package com.demo.basics;
public class StringDemo {

    public static void main(String args[]){
        char ball = 'a';  // stored as integers internally (16 bits unsigned integer 0 - 2 power 16 -1)
                          // unicode defines mapping between all characters/symbols -> integer
                          // Java used UTF - 16 for encoding (16 bits for storing character)

        int a = 'a';

        String myString = "test string";

        Boolean bin = false;

        System.out.println(a);
        System.out.println(ball);
        System.out.println(bin);
    }
}
