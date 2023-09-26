package com.learn.a01oopextensdemo7;

public class Teacher extends employee {
    public Teacher() {
    }

    public Teacher(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void workNess() {
        System.out.println("教员部员工在工作");
    }
}
