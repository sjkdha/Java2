package com.learn.a01oopextensdemo6;

public class cook extends Employee {
    public cook() {
    }

    public cook(String id, String name, double salary) {
        super(id, name, salary);
    }


    @Override
    public void work() {
        System.out.println(super.getName() + "在炒菜");
    }
}
