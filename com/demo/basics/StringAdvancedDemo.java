package com.demo.basics;

public class StringAdvancedDemo {

    public static void main(String[] args){
        String s = "test"; // recommended;

        System.out.println(s);


        //String is immutable.

        String a = "test2";
        String b = "test2";
        String c = "test2".intern();
        String d = new String("test2");
        String f = "t2";
        final String g = "t2";
        System.out.println((a == b));
        System.out.println((b == c));
        System.out.println((a == d)); // false
        System.out.println((a == ("tes"+"t2")));
        System.out.println((a == ("tes"+ f))); // false
        System.out.println((a == ("tes"+ g)));
        System.out.println((a.equals("tes"+ f)));


        // concatenation
        String ss = "story"+ "true"+ 123;
        String ss2 = "story"+ "true"+ 123 + 5; // 1235
        String ss3 = 123 + 5 + "story"+ "true"; //128
        System.out.println(ss3);

        // String builder -> mutable -> not synchronized
        StringBuilder sb = new StringBuilder();
        sb.append("hi");
        sb.append("hello");
        String result = sb.toString();
        System.out.println(sb);

        // + operator creates string builder for each operation
        String s9 ="";
        s9+= "a";
        s9+= "b";
        s9+= "c"; // copy of a, b & c -> too expensive

        // Better to use String builder for mutating string.



    }
}
