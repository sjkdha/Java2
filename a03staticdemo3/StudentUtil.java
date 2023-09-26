package com.learn.a03staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {
    }


    // 静态方法,获取最大年龄
    public static int getMaxAge(ArrayList<Student> list) {
        // 定义一个参照物
        int max = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            Student student = list.get(i);
            int age = student.getAge();
            if (age > max) {
                max = age;
            }
        }
        return max;
    }
}
