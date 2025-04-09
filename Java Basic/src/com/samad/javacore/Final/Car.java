package com.samad.javacore.Final;

public class Car extends Vehicle{

//    private final double PI = 3.14159;

    /*private static final double PI;
    static {
        PI = 3.14159;
    }*/

    /*private final double PI;

    public Car() {
        PI = 3.14159;
    }*/

    private final int speedLimit = 200;

    public int getSpeedLimit() {
        return speedLimit;
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void decelerate() {

    }

    public final void airBags() {
        System.out.println("4 Air Bags!");
    }
}
