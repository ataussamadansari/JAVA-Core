package com.samad.javacore.AccessModifier.school;

public class Student {
    public String name;
    public int age;  // anywhere
    private int rollNo; // only call in class

    public void sayHello() {
        System.out.println("Hello");
    }
}
