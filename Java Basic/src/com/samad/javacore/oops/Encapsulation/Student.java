package com.samad.javacore.oops.Encapsulation;

public class Student {
    // properties/fields/instance variable and behaviour

    private String name;
    private int age;
    private int rollNumber;

    // constructor
    public Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Invalid Age");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
