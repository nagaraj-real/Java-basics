package com.demo.oop;

public class TestOOP {
    public static void main(String[] args){
        User use = new Author();
        System.out.println(use.getUserType()); // only methods in User class can be called here

        //Compiler looks at reference type while JVM looks at object type bottom up

        // CASTING

        //Author au = (Author) new User();// error cast exception
        getAuthorName(new Author());
        getAuthorName(new User());

        // Override
        System.out.println(use.getMyOverrideMethod());
        System.out.println(new Author().getAuthorName());
        System.out.println(new Author());
    }

    public static void getAuthorName(User us){
        if(us instanceof Author){
            ((Author) us).getAuthorName();
        }else{
            System.out.println("Invalid object passed");
        }
    }
}
