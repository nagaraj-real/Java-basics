package com.demo.basics;
public class MethodDemo {

    static String doSomeThing(){
        name_static = name_static + " bye";
        return name_static;
    }

    // Below statements only order decides which executes first
    static String name_static = "first static";
    static {
        System.out.println("Static initializer");
    }


    // OVERLOAD


    // Below statements only order decides which executes first
    String name = "first2";

    //Executed before Constructor;
    {
        System.out.println("Instance initializer");
        name = "yes";
    }

    // Constructor (no return type)
    public MethodDemo(){
       name = "default";
       System.out.println("default constructor");
    }

    // Not a constructor
    public String MethodDemo(){
        name = "random method";
        return name;
    }

    public int Sum(int a ,int b){
        return a + b;
    }

    public int Sum(int a ,int b, int c){
        return a + b + c;
    }

    public long Sum(long a ,int b, int c){
        return a + b + c;
    }


    //Not overloads (just return type or access modified changed) Signature change needed (argument type, number)

//    public String Sum(int a ,int b, int c){
//       return "";
//    }
//    private int Sum(int a ,int b, int c){
//        return a + b + c;
//    }
//    public static int Sum(int a ,int b, int c){
//        return a + b + c;
//    }

    public double Sum(int a ,double b, int c){
        return a + b + c + 10;
    }

    private double Sum(int a ,double b, int c,int d,int e){
        return a + b + c;
    }


    // VARARGS

    // last parameter or only param
    public void exam(int a, int... b){
        System.out.println(a);
        System.out.println(b.length);
    }


    // Constructor overload

    public MethodDemo(String num){
        System.out.println(num);
    }

    //Delegation
    public MethodDemo(String num, String num2){
       this(num);
       this.name = num2;
    }

    public static void main(String[] args){
        var demo = new MethodDemo();
        var demo2 = new MethodDemo("param constructor");
        System.out.println(demo.name);
        System.out.println(MethodDemo.doSomeThing());
        System.out.println(demo.MethodDemo());
        System.out.println(MethodDemo.name_static);
        System.out.println(demo.Sum(1,1.0,3));
        System.out.println(demo.Sum(1,1,1)); // picks the more specific datatype(int)
        demo.exam(2,4,5,6);
        demo.exam(3);
        demo.exam(3,new int[]{1,2,3,6});

    }
}

