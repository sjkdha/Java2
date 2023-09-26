package com.learn.a01oopextensdemo1;

public class Test {
    // 创建对象并调用方法
    public static void main(String[] args) {
        // 1. 创建布偶猫的方法
        Ragdoll rd = new Ragdoll();
        rd.catchMouse();
        rd.eat();
        rd.drink();

        System.out.println("----------------");

        // 2. 创建哈士奇的对象
        Husky h = new Husky();
        h.brakeHome();
        h.eat();
        h.drink();
        h.lookHome();


    }
}
