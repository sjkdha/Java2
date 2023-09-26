package com.learn.a01Test;

public class basketballPlayer extends Player {
    public basketballPlayer() {
    }

    public basketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学打篮球");
    }
}
