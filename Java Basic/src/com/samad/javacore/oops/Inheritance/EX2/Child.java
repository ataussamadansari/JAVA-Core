package com.samad.javacore.oops.Inheritance.EX2;

public class Child extends Parent {

    public Child(String name, int age) {
        super(name, age);
        System.out.println("Child constructor called.");
    }

    public void childMethod() {
        super.ParentMethod();
        System.out.println("Child method called.");
    }
}
