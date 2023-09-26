package com.learn.API;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
    // 这是获取大整数的一个api
    //不可变的
    public static void main(String[] args) {
        // 1.获取一个随机的大整数
        Random r = new Random();
        BigInteger bd1 = new BigInteger(4, r); // 表示获取 0~2的四次方减1之间获取随机的大整数,包含0,包含2的四次方减1
        System.out.println(bd1);

        // 2.获取一个指定的大整数
        BigInteger bd2 = new BigInteger("999999999999999999999999"); // 只能写整数
        System.out.println(bd2);

        // 3.获取一个指定进制的大整数
        BigInteger bd3 = new BigInteger("100", 10); // 获取一个十进制的一百
        System.out.println(bd3);

        // 4.静态方法获取BigInteger的对象,内部有优化
        // 优化:在内部常用的数字: -16 ~ 16
        // 这个方法会提前创建好BigInteger的对象,如果多次获取就不会创建新的对象了
        BigInteger bd4 = BigInteger.valueOf(10); //范围是long类型范围,不能超出long类型范围
        BigInteger bd5 = BigInteger.valueOf(10);
        System.out.println(bd4 == bd5); // true 不会创建新的对象
    }
}
