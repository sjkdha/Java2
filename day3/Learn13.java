package com.learn.day3;

import java.util.Scanner;

public class Learn13 {
    public static void main(String[] args) {
        //三元运算符练习1：比较两个老虎的体重是否相同
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个老虎的体重:");
        int weight1 = sc.nextInt();
        System.out.println("请输入第二个老虎的体重:");
        int weight2 = sc.nextInt();
        String result = weight1 == weight2 ? "相同" : "不同";

        System.out.println(result);

        //三元运算符练习2：一座寺庙里住着三个和尚，已知他们身高分别为150cm，210cm，165cm
        //请用程序获取三个和尚的最高身高。
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        int msg = height1 > height2 ? height1 : height2;
        // ctrl + alt + L 自动格式化代码（代码对齐）
        int max = msg > height3 ? msg : height3;
        System.out.println(max);

    }
}
