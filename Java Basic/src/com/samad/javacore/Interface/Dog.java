package com.samad.javacore.Interface;

public class Dog  implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz...");
    }
}
