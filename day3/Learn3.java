package com.learn.day3;

public class Learn3 {
    //主入口
    public static void main(String[] args){
        //除法,由整数参与计算的除法结果只能是整数
        System.out.println(10 / 2); //5
        System.out.println(10 / 3); //3
        System.out.println(10.0 / 3);//3.3333333333333335

        // % 取模:实际上也是做除法运算，只不过最后得到的是余数
        System.out.println(10 % 2);//余0
        System.out.println(10 % 3);//余1
        //取模的实际应用
        //1.可以用来判断A是否可以被B整除
        //2.可以判断A是否为偶数
        //A % 2 如果结果为0，那么证明A是一个偶数，如果为1，那么证明A是奇数
        //3.斗地主发牌
        //把每张牌都定义一个序号
        //用序号 % 3 如果结果为一，那么发给第一个玩家
        //如果结果为2 那么发给第二个玩家
        //如果结果为0 那么发给第三个玩家
        System.out.println(1/10);
    }
}
