package com.samad.javacore;

public class Main {
    public static void main(String[] args) {
        //integral numbers
            //byte
            // short
            // int
            // long

        /*byte age = 20;
        short age2 = 32767;
        int age3 = 20;
        long age4 = 2147483649L;

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);*/

        //decimal number
            //float
            //double

        /*float f = 100.123456789012345f;
        double d = 100.1234567890123456;

        System.out.println(f);
        System.out.println(d);*/

        // Character
            //char
        /*char ch = 'A';
        System.out.println((int) Character.MIN_VALUE);
        System.out.println((int) Character.MAX_VALUE);
        System.out.println((char) 10084);
        System.out.println((char) '\u2734');*/

        //asci value
       /* for (int i = 0; i <= 127; i++) {
            System.out.println((char) i);
        }*/

        //Boolean
            //boolean
       /* boolean isFav = true;

        if (isFav) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }*/


        // Bitwise Operator
            // operands --> byte, short, int, long, [float and double is not support]
            // and &
            // or /
            // xor ^
            // not ~
            // left shift <<
            // right shift >>
            // unsigned right shift >>>

        /* ******************
        * AND &
        * 1 1 = 1
        * 1 0 = 0
        * 0 1 = 0
        * 0 0 = 0
        * ******************
        * OR |
        * 1 1 = 1
        * 1 0 = 1
        * 0 1 = 1
        * 0 0 = 0
        * ******************
        * XOR ^
        * 0 0 = 0
        * 0 1 = 1
        * 1 0 = 1
        * 1 1 = 0
        * ******************
        * Not ~
        * if + tive than convert - tive
        *    - tive than convert + tive
        * *******************/



     /*   int a = 5;
        System.out.println(~a);
        System.out.println(Integer.toBinaryString(~a));*/

        // left shift
        int a = 5;
        System.out.println(a >>> 1);
        System.out.println(Integer.toBinaryString(a >>> 1));

    }
}

