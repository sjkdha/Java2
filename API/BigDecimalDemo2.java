package com.learn.API;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo2 {
    public static void main(String[] args) {
        // 创建BigDecimal对象
        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(3.0);
        // 加法,减乘同理
        BigDecimal result = bd1.add(bd2);
        System.out.println(result);

        // 除法,除的尽的情况用这个,否则会报错
        BigDecimal bd3 = bd1.divide(bd2);
        System.out.println(bd3);

        BigDecimal bd4 = bd1.divide(bd2, 2, RoundingMode.HALF_UP); // 3.33 除以bd2,保留两位小数,四舍五入
        System.out.println(bd4);
    }
}
