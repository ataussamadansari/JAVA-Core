package com.samad.javacore.datatype;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Samad";
        student.address = "Varanasi";
        student.rollNumber = 123;
        student.standard = 4;

        System.out.println(student.name);
    }
}
