package com.demo.oop;

// Non abstract classes extending abstract must be implement all abstract methods
public class SubAbstract extends AbstractDemo{

    public SubAbstract(String name) {
        super(name);
    }

    @Override
    public void abstractMethod() {

    }
}
