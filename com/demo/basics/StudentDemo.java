package com.demo.basics;

import com.demo.oop.A1;

//PS C:\Users\NAGARAJ\dev\Java_My\learn> javac -cp ./target  -d ./target  .\com\demo\fileio\IODemo.java
//PS C:\Users\NAGARAJ\dev\Java_My\learn> java -cp ./target  com.demo.fileio.IOdemo
public class StudentDemo {

    private static final String MY_CUSTOM_TEXT= "Dummy text";
    // also constant variable because declaration done in compile time itself
    // not in constructor or initializer
    int id = 1000;
    final short age = 12; //constant
    short rank = 165;
    long phone = 956_786_7779L;
    float gpa = 8.98798798798987987987979f;
    double gpa_precise = 8.98798798798987987987979;
    char degree = '\u0043';

    String name = "John";

    String gender = "male";

    void compute(){
         int nextId = id +1;
         //age = 24; // cant change age
        // value -> constant but reference -> constant but contents cant be modified
        // cannot have default values
         System.out.println("id: "+ nextId);
         System.out.println("age:"+ age);
         System.out.println("rank:"+ rank);
         System.out.println("phone:"+ phone);
         System.out.println("gpa:"+ gpa);
         System.out.println("gpa pre:"+ gpa_precise);
         System.out.println("degree:"+ degree);
         System.out.println("name:"+ name);
         System.out.println("gender:"+ gender);
         register(name);

         A1 test = new A1();
        System.out.println(test.publicDummy);// only public
    }

    public static void main(String[] args){
        StudentDemo s = new StudentDemo();
        s.compute();
        PackageDemo d = new PackageDemo();
        System.out.println(d.getDate());
    }

    public void register(final String name){
           // name = "you"; cannot be done // local final
        System.out.println("gender:"+ gender);
    }
}

