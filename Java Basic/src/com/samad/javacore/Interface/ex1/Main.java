package com.samad.javacore.Interface.ex1;

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();
        obj.greet();          // default method
        MyInterface.info();   // static method
    }
}

