package com.learn.a01interfacedemo1;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("旺财", 2);
        System.out.println(d.getName() + ", " + d.getAge());
        d.swim();
        d.eat();
    }
}
