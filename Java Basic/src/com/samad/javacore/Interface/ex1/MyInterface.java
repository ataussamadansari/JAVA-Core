package com.samad.javacore.Interface.ex1;

interface MyInterface {
    void show();

    default void greet() {
        System.out.println("Hello from interface");
    }

    static void info() {
        System.out.println("Static method in interface");
    }
}

