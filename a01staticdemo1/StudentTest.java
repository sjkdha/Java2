package com.learn.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        // 创造第一个学生对象
        Student s1 = new Student();
        Student.teacherName = "冉老师";
        // static:静态变量,是Java的一个修饰符,可以用来修饰成员方法,也可以用来修饰成员变量,这里修饰的是变量
        // 特点:被所有对象共享
        // 调用方式: 类名.变量名
        // 这里的 teacherName 是每一个对象的属性,所以直接用类点上变量名赋值即可,因为这个变量是被这个static修饰的
        // 就会变成所有对象都会有这个值,是共享的

        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("男");

        s1.study();
        s1.show();

        // 创造第二个学生对象
        Student s2 = new Student();
        s2.setName("小红");
        s2.setAge(24);
        s2.setGender("女");

        s2.study();
        s2.show();
    }
}
