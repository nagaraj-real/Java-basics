package com.demo.oop;

//final public class User {} cannot be extended
//public sealed class User
//        permits Author {
//}
//sealed class User{} can only be extended by "permits"

public class User {

    public String my_variable ="test";

    // Private construct forces no objects references (may be only static)
    public User() {

    }
    public String getUserType(){
        return "in user class";
    }

    public String getMyOverrideMethod(){
        return  "default";
    }

    // cannot be overriden
    final public String getNonOverridenMethod(){
        return "non overriden method";
    }

    // Static not overriden
    public static String getCustomString(){
        return "empty";
    }

    @Override
    public String toString(){
        return "Interceptor" + super.toString();
    }

    // Hashcode same for same references
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    // other methods -> getClass , Clone
}
