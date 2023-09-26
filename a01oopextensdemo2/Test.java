package com.learn.a01oopextensdemo2;

public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.ziShow();
    }
}

class fu {
    String name = "fu";
    String hobby = "喝茶";
}

class Zi extends fu {
    String name = "Zi";
    String game = "吃鸡";

    public void ziShow() {
        // 打印Zi
        System.out.println(name); // 就近原则,如果在方面里面找不到name,那么就会去本类类成员位置里面去找,如果还找不到就回去父类成员位置去找
        System.out.println(this.name);  //直接在本类成员位置找
        // 打印fu
        System.out.println(super.name);
        // 打印喝茶
        System.out.println(hobby);
        System.out.println(this.hobby);
        System.out.println(super.hobby);
        // 打印吃鸡
        System.out.println(game);
    }
}

