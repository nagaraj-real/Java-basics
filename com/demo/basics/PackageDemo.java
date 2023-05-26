package com.demo.basics;

import java.util.ArrayList;
import java.util.Date;

public class PackageDemo {

    public static void main(String[] args){
        ArrayList al;
        Date dat = new Date();
        System.out.println(dat);
    }

    public Date getDate(){
        return new Date();
    }
}