package com.learn.API;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        // 创建两个BigInteger对象
        BigInteger bd1 = BigInteger.valueOf(6);
        BigInteger bd2 = BigInteger.valueOf(5);

        // 2.加法
        BigInteger result = bd1.add(bd2);
        System.out.println(result);

        // 3.除法:获取商和余数
        BigInteger[] arr = bd1.divideAndRemainder(bd2);
        System.out.println(arr[0]); // 商1
        System.out.println(arr[1]); // 余1

        // 4.比较是否相同
        boolean equals = bd1.equals(bd2);
        System.out.println(equals); // false

        // 5.次幂
        BigInteger bd4 = bd1.pow(2); // 表示6的二次方
        System.out.println(bd4);

        // 6.max
        BigInteger ba5 = bd1.max(bd2); // 会返回比较大的那个数,不会创建新的对象
        System.out.println(ba5 == bd1); // true

        // 7.转换为int类型,超出范围会报错, 转换为long和double类型同理
        BigInteger bd6 = BigInteger.valueOf(1000);
        int i = bd6.intValue();
        System.out.println(i);
    }
}
