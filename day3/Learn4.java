package com.learn.day3;

import java.util.Scanner;

public class Learn4 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        int number = sc.nextInt();

        //获取个位 十位 百位
        //公式
        //个位：  数字 % 10
        //十位    数字 / 10 % 10
        //百位    数字 / 10 /10 % 10
        int ge = number % 10 ;
        int shi = number / 10 % 10;
        int bai = number / 10 /10 % 10;
        System.out.println("个位是："+ ge);
        System.out.println("十位是："+ shi);
        System.out.println("百位是："+ bai);
    }
}
