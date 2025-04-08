package com.samad.javacore.oops.Abstraction;

public abstract class Animal {


    public abstract void sound(); //abstract method

    // concrete method
    public void sleep() {
        System.out.println("Zzz...");
    }
}
