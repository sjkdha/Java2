package com.learn.API;

import java.math.BigDecimal;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        // 用于计算小数
        // 1.通过传递double类型的小数来创建对象
        // 这种方式是可能是不精确的,不建议使用
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);
        System.out.println(bd1);
        System.out.println(bd2);

        // 2.通过传递字符串表示的小数来创建对象
        // 如果超出了double的取值范围建议用这个构造方法
        BigDecimal bd3 = new BigDecimal("0.09"); // 精确打印
        BigDecimal bd4 = new BigDecimal("0.01");
        BigDecimal result = bd3.add(bd4); // 精确计算
        System.out.println(bd3);
        System.out.println(bd4);
        System.out.println(result);

        // 通过静态方法获取对象
        // 表示的数字不大没有超过double的取值范围建议使用静态方法
        // 如果我们传递的是 0 ~ 10 之间的整数,包含0,包含10,那么方法会返回已经创建好的对象,不会重新new
        BigDecimal ba5 = BigDecimal.valueOf(10);
        System.out.println(ba5);

    }
}
