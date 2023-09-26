package com.learn.a01oopextensdemo6;

public class Test {
    public static void main(String[] args) {
        manager m = new manager("01", "张三", 15000, 5000);
        System.out.println(m.getId() + ", " + m.getName() + ", " + m.getSalary() + ", " + m.getBouns());

        m.work();
        m.eat();

        cook c = new cook();
        c.setId("02");
        c.setName("李四");
        c.setSalary(8000);
        System.out.println(c.getId() + ", " + c.getName() + ", " + c.getSalary());

        c.work();
        c.eat();
    }
}
