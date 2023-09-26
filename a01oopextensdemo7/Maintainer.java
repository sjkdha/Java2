package com.learn.a01oopextensdemo7;

public class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void workNess() {
        System.out.println("维护专员在维护电路");
    }
}
