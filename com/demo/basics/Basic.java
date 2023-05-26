package com.demo.basics;

import com.demo.oop.A1;

import java.math.BigDecimal;

public class Basic extends A1 {
    // Naming rules
    int _id =0;
    String a = "";
    Boolean b = true;
    Double d = 1.234234234;
    Float f = 1.234234234f;
    static final BigDecimal bc = BigDecimal.valueOf(1.234234234);
    public void foo(){

    }

    //2. ** Java is case sensitive


    //3.

    public static void main(String[] args){

        System.out.println(bc);
        A1 test = new A1();
        System.out.println(test.publicDummy);
    }

    public String getTestString(){
        //return internalDummy; not possible
        System.out.println(publicDummy);
        return protectedDummy;
    }
}
