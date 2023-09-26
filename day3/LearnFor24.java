package com.learn.day3;

public class LearnFor24 {
    public static void main(String[] args) {
        //需求：正着打印1-5，倒着打印5-1

        //正着
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        //倒着
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

        int sum = 0;
        //求一到一百之间的偶数和
        for (int i = 1; i <= 100; i++) {
            //2.累加求和，先求和，再判断
            if (i % 2 == 0){
                sum +=i;
            }
        }
        System.out.println(sum);
    }
}
