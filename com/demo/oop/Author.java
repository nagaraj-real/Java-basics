package com.demo.oop;

public class Author extends User {


    public String my_variable ="test";
    public Author() {
        super();
    }

    public String getUserType(){
        return "in Author class";
    }

    public String getAuthorName(){
        return getCustomString() + "test" ;
    }

    //  cannot override final methods
//    public String getNonOverridenMethod(){
//        return "test";
//    }

    // Return type for primitive exact same but reference type it can be similar(child)

    // Non overriden items -> Static(initially bounded) , Instance variables(initially bounded) , Final methods
    public String getMyOverrideMethod(){
        return super.getMyOverrideMethod() + " now in author";
    }

    public static String getCustomString(){
        return  "my string";
    }


}
