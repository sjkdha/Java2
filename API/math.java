package com.learn.API;

public class math {
    public static void main(String[] args) {
        // 返回绝对值
        System.out.println(Math.abs(-88));

        // 进一法向上取整
        System.out.println(Math.ceil(-12.34));
        System.out.println(Math.ceil(-12.76));

        //向下取整
        System.out.println(Math.floor(-12.34));
        System.out.println(Math.floor(-12.76));

        // 获取两个整数的较大值和较小值
        System.out.println(Math.max(20,30));
        System.out.println(Math.min(20,30));

        // 返回a的b次幂
        System.out.println(Math.pow(2,3)); // 2的3次方

        // 开平方
        System.out.println(Math.sqrt(4));

        // 开立方
        System.out.println(Math.cbrt(8));


    }
}
