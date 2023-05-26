package com.demo.oop;

public class TestInterfaceDemo implements InterfaceDemo,SiblingInterfaceDemo {

    @Override
    public String getType() {
       // return new_variable; -> ambiguity same name of variable(static)
        return InterfaceDemo.new_variable; //proper way to avoid ambiguity
    }

    // CHild class has to implement default method if both interface has the same default
    @Override
    public String getDefaultType() {
        return InterfaceDemo.super.getDefaultType();
       // return SiblingInterfaceDemo.super.getDefaultType();
    }
}
