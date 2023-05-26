package com.demo.basics;
public class TypeCastingDemo {

    public static void main(String[] args){
        //Only numeric to numeric casting possible
        //Implicit conversion only possible when there is no data loss -> widening conversion

        int b = 123;
        long ad = b; // widening;
        System.out.println(ad);

        int result = (int)12345678909L; // narrowing - explicit conversion
        System.out.println(result);

       // Boolean boo = (Boolean) "2"; // Booleans can never be casted

        float res = (1 + 2)/2;
        System.out.println(res);

        float res2 = (float)(1 + 2)/2; // explicit needed evn though no error
        System.out.println(res2);


    }
}
