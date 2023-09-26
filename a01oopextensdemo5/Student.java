package com.learn.a01oopextensdemo5;

public class Student extends Person{

    public Student(){
        // 子类的构造方法中隐藏的supper()去访问父类的无参构造,supper必须写在构造方法的第一行
        super();
        System.out.println("子类的无参构造");
    }

    public Student(String name,int age){
        super(name, age);
    }
}
