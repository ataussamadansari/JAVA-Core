package com.samad.javacore.Interface.MultipleInhEx;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();

        smartPhone.makeCall("9876543210");
        smartPhone.receiveCall();

        smartPhone.playMusic("Apna Bana Le");
        smartPhone.stopMusic();

        smartPhone.takePhoto();
        smartPhone.recordVideo();
    }
}
