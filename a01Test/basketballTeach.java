package com.learn.a01Test;

public class basketballTeach extends Player{
    public basketballTeach() {
    }

    public basketballTeach(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球教练教打蓝球");
    }
}
