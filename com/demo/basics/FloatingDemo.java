package com.demo.basics;

import java.math.BigDecimal;

public class FloatingDemo {
    static float a = 1.34f; // 32 bits
    static double b = 23.767; // 64 bits // recommended (more precise)

    static double result = 0.1 + 0.2;



    public static void main(String[] args){
        System.out.println(a);
        System.out.println(b);
        System.out.println(0.1);
        System.out.println(0.1 + 0.2);
        System.out.println(0.3 + 0.2); // denominator power of 2 so precise.
        System.out.println(result);
        BigDecimal money_result = BigDecimal.valueOf(0.1).add(BigDecimal.valueOf(0.2));
        System.out.println(money_result);
    }
}
