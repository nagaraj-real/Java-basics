package com.demo.basics;
public class IntegerDemo {
    int id = 1000;


    byte age2 = 12;
    short rank = 165;
    int age = 23; // recommended
    long phone = 956_786_77788L;


    void compute(){
         int nextId = id +1;
         System.out.println("id: "+ nextId);
         System.out.println("nextId:"+ nextId);
         System.out.println("age:"+ age);
         System.out.println("rank:"+ rank);
         System.out.println("phone:"+ phone);
         System.out.println("min int:"+ Integer.MIN_VALUE);
         System.out.println("max int:"+ Integer.MAX_VALUE);
    }

    public static void main(String[] args){
        IntegerDemo s = new IntegerDemo();
        s.compute();
    }
}
