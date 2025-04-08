package com.samad.javacore.oops;

public class Car {
    // properties
    String color;
    String brand;
    String model;
    int year;
    int speed;

    // method

    public void accelerate(int increment) {
        speed += increment;
    }

    public void brake(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
    }

}
