package com.learn.a01Test;

// 因为我不想要外界去创建人的对象
// 因为直接创建没有任何意义
// 所以我就把这个类定义成抽象的
public abstract class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
