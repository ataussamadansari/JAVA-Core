package com.samad.javacore.oops.Inheritance.EX2;

public class GrandParent {

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

    public GrandParent(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Grand Parent constructor called.");
    }
}
