package com.learn.day3;

//统计思想

import java.util.Scanner;

public class LearnFor25 {
    public static void main(String[] args) {
        /*需求：
        键盘录入两个数字表示一个范围
        统计这个范围中
        既能被3整除，又能被5整除的数字有多少个
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int number2 = sc.nextInt();

        //定义一个统计变量，统计符合要求的个数
        int count = 0;

        for (int i = number1; i <= number2; i++) {
            if (i % 3== 0 && i % 5 ==0){
                //System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
