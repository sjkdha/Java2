package com.learn.a01oopextensdemo8;

public class Teacher extends SchoolPeople{
    private String dept;

    public Teacher() {
    }

    public Teacher(String name, int age, String dept) {
        super(name, age);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void putQuestion(){
        System.out.println("老师在发布问题");
    }
}
