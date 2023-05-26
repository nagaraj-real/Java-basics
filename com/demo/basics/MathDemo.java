package com.demo.basics;

public class MathDemo {


    public static void main(String[] args){
        double random1 = Math.random(); //[0.0,0.1)
        int random2 = (int)(random1*100);
        System.out.println(random1);
        System.out.println(random2);

        //rounding
        System.out.println(Math.round(17.12)); // 17
        System.out.println(Math.round(17.67)); // 18
        System.out.println(Math.round(17.5)); // 18
        System.out.println(Math.round(17)); // 17


        //ceil is the smallest integer greater than n
        System.out.println(Math.ceil(17.12)); // 18
        System.out.println(Math.ceil(17.67)); // 18
        System.out.println(Math.ceil(17.5)); // 18
        System.out.println(Math.ceil(17)); // 17

        //ceil is the smallest integer greater than n
        System.out.println(Math.floor(17.12)); // 17
        System.out.println(Math.floor(17.67)); // 17
        System.out.println(Math.floor(17.5)); // 17
        System.out.println(Math.floor(17)); // 17

        //Max , abs, pow
        System.out.println(Math.max(17.8,20.4));
        System.out.println(Math.abs(-17.99));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(8));
        System.out.println(Math.sqrt(-77)); // NaN
        System.out.println(Math.log(10));
    }
}
