package com.demo.oop;

public class A2 extends A1 {
    public static void main(String[] args){
        A2 test = new A2();
        System.out.println(test.internalDummy);
        System.out.println(test.protectedDummy);
        System.out.println(test.publicDummy);
//        System.out.println(test.privateDummy); error
    }
}
