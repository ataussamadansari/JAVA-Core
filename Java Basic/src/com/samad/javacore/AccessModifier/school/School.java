package com.samad.javacore.AccessModifier.school;

public class School {
    private static School instance;

    private School() {

    }

    public static School getInstance() {
        if (instance == null) {
            instance = new School();

        }
        return instance;
    }
}
