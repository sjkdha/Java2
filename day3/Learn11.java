package com.learn.day3;

import java.util.Scanner;

public class Learn11 {
    public static void main(String[] args) {
        /*练习：键盘录入两个整数，如果其中一个为6，最终输出为true
        如果他们的和为6的倍数，最终输出true
        其他都为false*/

        //设置两个变量 a  b
        // a == 6 || b == 6 || (a+b) % 6 ==0
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int number2 = sc.nextInt();
        boolean result=number1 == 6 || number2 == 6 || (number1 + number2) % 6 == 0;
        System.out.println(result);

    }
}
