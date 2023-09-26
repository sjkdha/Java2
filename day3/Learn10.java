package com.learn.day3;

public class Learn10 {
    public static void main(String[] args) {
        //短路逻辑运算符
        //符号
        //&&：短路与（结果与&相同，但具有短路效果）
        //两边都为真，结果才是真
        System.out.println(true && false); //false
        System.out.println(true && true); //true
        System.out.println(false && false); //false
        //||：短路或（结果与|相同，但具有短路效果）
        //两边都为假，结果才是假
        System.out.println(true || false); //true
        System.out.println(true || true); //true
        System.out.println(false || false); //false

        //短路逻辑运算符具有短路效果
        int a = 10;
        int b = 20;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result); //false
        System.out.println(a); //11
        System.out.println(b); //20,因为++a已经自增等于11，已经大于5了为false，所以++b将不再自增（短路）如果是一个&将自增

        // & |，无论左边是true还是false，右边都要执行
        // && ||：如果左边能确定整个表达式的结果，那么右边将不再执行（短路）
        // &&：左边为false，右边不管是真是假，整个表达式一定是false
        // ||：左边是true，右边不管是真是假，整个表达式一定是true

        //：最常用的逻辑运算符：&& || ！

    }

}
