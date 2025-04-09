package com.samad.javacore.AccessModifier.test;

import com.samad.javacore.AccessModifier.Utils.Utils;
import com.samad.javacore.AccessModifier.Zoo.Dog.Dog;
import com.samad.javacore.AccessModifier.school.School;
import com.samad.javacore.AccessModifier.school.Student;

public class Test {
    public static void main(String[] args) {
        //Public
        /*Student student = new Student();
        student.age = 12;
        student.name = "sffg";*/

        // private
//        student.rollNo = 123; // 'rollNo' has private access in 'com.samad.javacore.AccessModifier.school.Student

/*        Utils.sayHey();
        Utils.sayBye();*/

        /*School.getInstance();
        School.getInstance();
        School.getInstance();
        School.getInstance();
        School.getInstance();*/

        //Protected

        Dog dog = new Dog("Bob");
        dog.makeSound();
//        dog.changeSound("Woof"); // 'changeSound(java.lang.String)' has protected access in 'com.samad.javacore.AccessModifier.Zoo.Animal.Animal
        dog.setDogSound("Woof");
        dog.makeSound();
        dog.wagTail();

    }
}
