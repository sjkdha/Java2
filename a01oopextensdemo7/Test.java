package com.learn.a01oopextensdemo7;

public class Test {
    public static void main(String[] args) {
        Maintainer m = new Maintainer("001", "张三", "维修专员");
        m.workNess();

        System.out.println(m.getId() + ", " + m.getName() + ", " + m.getWork());

        Buyer b = new Buyer("002", "李四", "采购专员");
        System.out.println(b.getId() + ", " + b.getName() + ", " + b.getWork());
        b.workNess();
    }
}
