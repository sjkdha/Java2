package com.learn.a01innerclassdemo1;

public class Test {
    public static void main(String[] args) {
        // 匿名内部类
        // 实现
        Swim swim = new Swim() {
            @Override
            public void swim() {
                System.out.println("重写了swim方法");
            }
        };
        swim.swim();

        // 继承
        Animal a = new Animal() {
            @Override
            public void eat() {
                System.out.println("狗在吃骨头");
            }
        };
        a.eat();
    }
}
