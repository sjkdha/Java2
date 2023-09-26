package com.learn.day3;

public class Learn12 {
    public static void main(String[] args) {
        //三元运算符：
        //格式：关系表达式？表达式1:表达式2;
        int a = 5;
        int b =10;

        // 使用三元运算符获取两个整数的较大值
        // 整个三元运算符必须要被使用
        int max=a > b ? a : b;
        System.out.println(max);

        System.out.println(a > b ? a : b);


    }
}
