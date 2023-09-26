package com.learn.a01oopextensdemo7;

public class Buyer extends AdminStaff{
    public Buyer() {
    }

    public Buyer(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void workNess() {
        System.out.println("采购专员在给学校采购空调");
    }
}
