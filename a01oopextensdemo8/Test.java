package com.learn.a01oopextensdemo8;

public class Test {
    public static void main(String[] args) {
        Students s = new Students("张三", 23, "计应6班");
        System.out.println(s.getName() + ", " + s.getAge() + ", " + s.getaClass());
        s.setFeed();
        s.see();

        Teacher t = new Teacher("李老师", 24, "教育部");
        System.out.println(t.getName() + ", " + t.getAge() + ", " + t.getDept());
        t.see();
        t.putQuestion();
    }
}
