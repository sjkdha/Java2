package com.learn.day3;

public class Learn9 {
    public static void main(String[] args) {
        //逻辑运算符
        //逻辑符号
        // &：逻辑与（且），表示并且，两边都为真结果才为真
        System.out.println(true & false); //false
        System.out.println(true & true); //true
        System.out.println(false & false); //false

        // |：逻辑或，表示或者，两边都为假结果才是假,只要一个为真结果就是真
        System.out.println(true | false);//true
        System.out.println(true | true);//true
        System.out.println(false | false);//false

        // ^:逻辑异或，相同为假，不同为真（用的比较少）
        System.out.println(true ^ false); //true
        System.out.println(true ^ true); //false

        // ！：逻辑非，取反,取反感叹号不要写多次要么不写要么只写一次
        System.out.println(!true); //false
        System.out.println(! false); //true
    }
}
