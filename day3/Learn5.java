package com.learn.day3;

public class Learn5 {
    public static void main(String[] args) {
        //隐式转换 （小转大）
        //取值范围：byte < short < int < long < float < double
        //数据类型不一样不能直接进行计算，需要转成一样的才可以进行计算
        //转换规则1：取值范围小的，和取值范围大的进行运算，小的会先提升为大的，再进行运算
        //转换规则2：byte short char 三种类型和数据在运算的时候，都会直接先提升为int，再进行运算

        //强制转换（大转小）
        //强制转换格式：double a = 123;
        //             int b = int (a)
        //强制转换习题
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);  //这种式子强制转换写法，要转换的数据过大也许会出现数据错误
        System.out.println(c); //30


    }

}
