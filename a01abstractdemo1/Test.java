package com.learn.a01abstractdemo1;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("旺财", 3);
        System.out.println(d.getName() + ", " + d.getAge());
        d.eat();
        d.drink();
    }
}
