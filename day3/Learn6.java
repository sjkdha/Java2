package com.learn.day3;

public class Learn6 {
    public static void main(String[] args) {
        char c = 'a';
        int a = c + 0 ;
        char d = 'b';
        int b = d + 0;
        System.out.println(a);//参看ASCII码表 a代表97 每一个字母都和一个数字有着对应关系,当被用来做算术时会被调用ASCII码表中的数字
        System.out.println(b);
        System.out.println(1+'c');
        //自增运算符
        int z = 10;
        //a++ 或 ++a
        z++;
        System.out.println(z);
        ++z;
        System.out.println(z);
        //自减运算符
        z--;
        System.out.println(z);
        --z;
        System.out.println(z);

        //一起用（用的比较少）
        int m = 10;
        int k =m++;
        System.out.println(k); // 先用后加：即k=10 m=11


        int v = 10;
        int l =++v;
        System.out.println(l);//先加后用：即l=11 v=10



    }
}
