package com.samad.javacore.recursion;

public class RecursionEx {
    public static void main(String[] args) {
        System.out.println(factorial(5));
//        System.out.println(sumOfNaturalNumber(5));
    }

    public static int factorial(int n) {
        if (n <= 0) return 0; // handle zero or negative input
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    // sum of n natural number
    public static int sumOfNaturalNumber(int n) {
        if (n <= 0) return 0; // handle zero or negative input
        if (n == 1) return 1;
        return n + sumOfNaturalNumber(n - 1);
    }
}
