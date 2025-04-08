package com.samad.javacore.oops;

public class OopsExample {
    public static void main(String[] args) {
        // Object
        Car car = new Car();

        car.color = "Black";
        car.brand = "TATA";
        car.model = "Safari";
        car.year = 2025;
        car.speed = 80;

        // method call
        car.accelerate(20);
        System.out.println(car.speed);
    }
}
