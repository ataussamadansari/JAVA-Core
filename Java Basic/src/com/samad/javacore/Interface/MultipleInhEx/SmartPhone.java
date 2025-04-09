package com.samad.javacore.Interface.MultipleInhEx;

public class SmartPhone implements Phone, MusicPlayer, Camera {

    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + "...");
    }

    @Override
    public void receiveCall() {
        System.out.println("Incoming call...");
    }

    @Override
    public void playMusic(String trackName) {
        System.out.println("Playing track: " + trackName);
    }

    @Override
    public void stopMusic() {
        System.out.println("Music stopped.");
    }

    @Override
    public void takePhoto() {
        System.out.println("Photo captured!");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video...");
    }
}
