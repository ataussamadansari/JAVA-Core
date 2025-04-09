package com.samad.javacore.Interface;

public interface Animal {

    //static constant
    public static final int MAX_AGE = 150; // redundant : public static final

    public abstract void eat();
    void sleep();

    //static method
    static void info() {
        System.out.println("This is an Animal interface.");
    }
}
