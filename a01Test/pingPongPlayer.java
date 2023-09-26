package com.learn.a01Test;

public class pingPongPlayer extends Player implements speakEnglish {
    public pingPongPlayer() {
    }

    public pingPongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学打乒乓球");
    }

    @Override
    public void English() {
        System.out.println("乒乓球运动员说英语");
    }
}
