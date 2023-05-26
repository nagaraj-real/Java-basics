package com.demo.oop;

import java.io.*;
import java.util.Random;

public class ExceptionsDemo {
    public static void main(String[] args){
        try {
            throw new ArithmeticException();
        }catch (ArithmeticException ex ){ // child(specific) exceptions must come before general one
            System.out.println("here1 "+ ex.toString());
            ex.printStackTrace();
        }catch (Exception ex){
            System.out.println("here2 "+ex.toString());
            ex.printStackTrace();
        }finally {
            System.out.println("finally");
        }
        ExceptionsDemo ed = new ExceptionsDemo();
        String sd = ed.testMethod();

        try {
            ed.testMethod2();
        }catch (Exception ex){
            System.out.println("here3 "+ex.toString());
        }

        try {
            ed.testMethod4();
        }catch (Exception ex){
            System.out.println("here4 "+ex.toString());
            System.out.println("here4 "+ex.getSuppressed()[0]);
            ex.printStackTrace();
        }

    }

    // unchecked exception no need for throws
    public String testMethod() throws ArrayIndexOutOfBoundsException{
        double a = 0.7;
        System.out.println(a);
        if(a < 0.5) {
            throw new ArrayIndexOutOfBoundsException();
        }else{
            return "";
        }
    }

    // Checked exception must be having throws
    public String testMethod2() throws IOException {
        double a = 0.7 ;
        System.out.println(a);
        if(a < 0.5) {
            throw new IOException();
        }else{
            return "";
        }
    }

    // auto closable entities can be used with try with syntax
    // type -> autoClosableInterface
    // automatic resource management
    public void testMethod3()  {
        try(FileInputStream in = new FileInputStream("");FileOutputStream out = new FileOutputStream("")){

            // After try -> out closed first then in is closed. (reverse order);
        }catch (FileNotFoundException ex){

        } catch (IOException ex){ // IO exception needed else compile time

        }
    }

    // Suppressed exception
    public void testMethod4() throws IOException  {
        FileInputStream in =null;
        FileInputStream in2 =null;
        FileOutputStream out;
        Exception ex = null;
        try{
            in = new FileInputStream(""); // supressed exception
            in2 = new FileInputStream("");

        }catch (FileNotFoundException ex2) {
            //throw ex;
            //correction
            ex = ex2;
        }finally
         {
            if(in != null) {
                in.close();
            }
            if(in2 !=null){
                in2.close();
            }
           //throw new IOException("test"); // exception occuring in finaly block supresses the error

           // correction
             IOException ex1 = new IOException("test");
             ex1.addSuppressed(ex);
             throw ex1;
        }
    }
}
