package com.learn.a01oopextensdemo7;

public class Lecturer extends Teacher {
    public Lecturer() {
    }

    public Lecturer(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void workNess() {
        System.out.println("讲师在讲课");
    }
}
