package com.learn.a03staticdemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 创建一个对象用于存储学生对象
        ArrayList<Student> list = new ArrayList<>();

        // 创建3个学生对象
        Student s1 = new Student("张三",23,"男");
        Student s2 = new Student("李四",24,"男");
        Student s3 = new Student("小红",25,"女");

        // 把学生对象添加到集合中

        list.add(s1);
        list.add(s2);
        list.add(s3);

        //调用工具类里面的方法获取最大年龄
        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);
    }
}
