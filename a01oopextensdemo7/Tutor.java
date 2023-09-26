package com.learn.a01oopextensdemo7;

public class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void workNess() {
        System.out.println("助教在讲课");
    }
}
