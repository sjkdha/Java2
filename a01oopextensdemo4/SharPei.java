package com.learn.a01oopextensdemo4;

public class SharPei extends Dog{
    @Override
    public void eat() {
        super.eat(); // 吃狗粮
        System.out.println("沙皮狗在吃骨头");
    }
}
