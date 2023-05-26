package com.demo.basics;

import java.math.BigDecimal;
import java.util.ArrayList;

public class BoxPrimitivesDemo {

    public static void main(String[] args){
        int a = 123;
        Integer b = Integer.valueOf(a);
        System.out.println(b);
        System.out.println(b.intValue());

        //Integer boxedId = Integer.valueOf(""); // number format exception
        Integer boxedId2 = Integer.valueOf("8"); // int or string possible for all boxed ones except for char
        Long boxedId3 = Long.valueOf("123");
        Float boxedId4 = Float.valueOf(1124.532424f);
        BigDecimal boxedId5 = BigDecimal.valueOf(1124.532424);


        int BoxedInt = boxedId2.intValue();


        System.out.println(boxedId2);
        System.out.println(boxedId5);
        System.out.println(BoxedInt);


        // Parsing strings
        String data = "123 true 456.8 adsjkn";
        String[] split = data.split(" ");
        System.out.println(split[1]);
        int startnum = Integer.parseInt(split[0]);
        boolean bool = Boolean.parseBoolean(split[1]);
        double dec = Double.parseDouble(split[2]);
        System.out.println(startnum);
        System.out.println(bool);
        System.out.println(dec);

        int startnum2 = Integer.valueOf(split[0]);
        System.out.println(startnum2);

        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isLetter('b'));
        System.out.println(Character.isLetterOrDigit('c'));
        System.out.println(Character.isUpperCase('c'));

        System.out.println(Double.isNaN(1.23));

        //ArrayList<boolean> arr = new ArrayList<boolean>(); // Type argument in generics cant be primitive


        // Auto boxing
        Integer a4 = 6; //auto conversion of primitive to boxing

        // Auto unboxing
        int a5 = a4;

        // autoboxing works for arraylist not for Arrays

        // prefer primitive over boxed.

        // Boxed primitives can't be compared using == or !== as it checks only for reference not value.
        // <,> comparison used auto unboxing for comparisons
        Integer test1 = Integer.valueOf(123);
        Integer test2 = Integer.valueOf(125);

        System.out.println(test1 == test2); // works checks both identity(reference) and values

        // Box primitives are initialized by null like all objects.

    }

}
