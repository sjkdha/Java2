package com.learn.a01abstractdemo1;

public class frog extends Animal{
    public frog() {
    }

    public frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }
}
