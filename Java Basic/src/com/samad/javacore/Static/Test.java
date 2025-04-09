package com.samad.javacore.Static;

public class Test {
    public static void main(String[] args) {
        /*Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

//        System.out.println(Student.count);
//        System.out.println(Student.schoolName);

        Student.getCount();*/

        int findMax = Utils.max(10, 21);
        System.out.println(findMax);

        System.out.println(Utils.trimAndUpperCase("  dhsh io kldf l     "));
    }
}
