package com.learn.a01oopextensdemo8;

public class Students extends SchoolPeople{
    private String aClass;

    public Students() {
    }


    public Students(String name, int age, String aClass) {
        super(name, age);
        this.aClass = aClass;
    }

    public String getaClass() {
        return aClass;
    }

    public void setaClass(String aClass) {
        this.aClass = aClass;
    }

    public void setFeed(){
        System.out.println("学生在填写听课反馈");
    }
}
