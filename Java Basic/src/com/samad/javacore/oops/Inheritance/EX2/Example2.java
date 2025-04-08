package com.samad.javacore.oops.Inheritance.EX2;

public class Example2 {
    public static void main(String[] args) {
        Child child = new Child("Samad", 22);

        System.out.println(child.getName() + " " + child.getAge());
        child.childMethod();
    }
}
