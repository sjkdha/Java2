package com.learn.a01polymorphismdemo4;

public class Person {
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

    // 多态
    public void keepPet(Animal a, String something) {
        if (a instanceof Dog d) {
            System.out.println(age + "岁的" + name + "养了一只" + a.getColor() + "色的" + a.getAge() + "岁的" + "狗");
            d.eat(something);
        } else if (a instanceof Cat c) {
            System.out.println(age + "岁的" + name + "养了一只" + a.getColor() + "色的" + a.getAge() + "岁的" + "猫");
            c.eat(something);
        }else {
            System.out.println("没有这种动物");
        }

    }
}
