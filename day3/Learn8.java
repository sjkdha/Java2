package com.learn.day3;

import java.util.Scanner;

public class Learn8 {
    public static void main(String[] args) {
        //关系运算符
        // a==b:判断a和b的值是否相等，成立为true，不成立为false
        // a！=b:判断a和b的值是否不相等，成立为true，不成立为false
        // a>b:判断a是否大于b，成立为true，不成立为false
        // a>=b:判断a是否大于等于b，成立为true，不成立为false
        // a<b:判断a是否小于b，成立为true，不成立为false
        // a<=b:判断a是否小于等于b，成立为true，不成立为false

        //练习：约会
        //我的时髦程度比相亲对象高约会成功，反之失败
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的时髦度:");
        int myFashion = sc.nextInt();
        System.out.println("请输入相亲对象的时髦程度:");
        int sheFashion = sc.nextInt();
        boolean result=myFashion > sheFashion;
        System.out.println(result);
    }
}
