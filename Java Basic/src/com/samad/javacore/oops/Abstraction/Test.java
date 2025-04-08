package com.samad.javacore.oops.Abstraction;

public class Test {
    public static void main(String[] args) {

//        Animal animal = new Animal(); // Abstraction class can't create object

        Animal dog = new Dog();
        dog.sound();

        Animal cat = new Cat();
        cat.sound();

    }
}
