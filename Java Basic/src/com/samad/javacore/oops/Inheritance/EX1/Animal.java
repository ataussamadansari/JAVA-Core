package com.samad.javacore.oops.Inheritance.EX1;

public class Animal {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("This animal eats food.");
    }

    public void sayHello() {
        System.out.println("");
    }
}
