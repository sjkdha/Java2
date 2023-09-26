package com.learn.a01polymorphismdemo4;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("老李",23);
        Cat cat = new Cat(2,"白");
        Dog dog = new Dog(3,"黑");

        p.keepPet(dog,"骨头");
        p.keepPet(cat,"小鱼干");
    }
}
