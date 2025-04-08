package com.samad.javacore.oops.Inheritance.EX2;

public class Parent extends GrandParent {
    public Parent(String name, int age) {
        super(name, age);
        System.out.println("Parent constructor called.");
    }
    
    public void ParentMethod() {
        System.out.println("Parent method called.");
    }
}
