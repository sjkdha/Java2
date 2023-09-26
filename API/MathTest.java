package com.learn.API;

public class MathTest {
    public static void main(String[] args) {
        // 统计有多少 个 水仙花数


        int count = 0;
        for (int i = 100; i < 999999; i++) {
            // 拿到每一位三位数的个位,十位,百位
            int ge = i % 10; // 余数
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            // 判断每一个的三次方之和跟本身是否相等
            double sum = (Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3));
            if (sum == i) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("有" + count + "个水仙花数");
    }
}
