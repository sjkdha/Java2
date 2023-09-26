package com.learn.a01oopextensdemo7;

public class AdminStaff extends employee {
    public AdminStaff() {
    }

    public AdminStaff(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void workNess() {
        System.out.println("行政部员工在工作");
    }
}
