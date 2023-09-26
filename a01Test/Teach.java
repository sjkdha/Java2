package com.learn.a01Test;

public abstract class Teach extends Person{
    public Teach() {
    }

    public Teach(String name, int age) {
        super(name, age);
    }
    public abstract void teach();
}
