package com.demo.oop;

public class DramaAuthor extends Author {
    public String getUserType(){
        return "in Drama class";
    }

    public String getDramaType(){
        return "drama type";
    }


    // Weaker privilege cant be assigned for overriden -> public - private

//    private String getMyOverrideMethod(){
//        return "drama author override";
//    }

}
