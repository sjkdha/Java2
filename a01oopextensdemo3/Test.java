package com.learn.a01oopextensdemo3;

public class Test {
    public static void main(String[] args) {
        OverseaStudent o = new OverseaStudent();
        o.lunch();
    }
}
class Person{
    public void eat(){
        System.out.println("吃米饭,吃菜");
    }

    public void drink(){
        System.out.println("喝开水");
    }
}

// 留学生
class OverseaStudent extends Person{
    public void lunch(){
        this.eat();
        this.drink();

        super.eat();
        super.drink();
    }

    // 当父类中的方法无法满足子类的需求时,我们需要把这个方法重写
    @Override // 重写的格式
    public void eat(){
        System.out.println("意大利面");
    }
    @Override
    public void drink(){
        System.out.println("喝凉水");
    }
}
class Student extends Person{

    public void lunch() {
        // 先会在本类看有没有eat和drink方法,有就会调用子类的,没有就会去父类继承下来的eat和drink方法
        eat(); // 前面都有一个隐含的this.
        drink(); // 前面都有一个隐含的this.

        super.eat(); //直接在父类调用方法
        super.drink();
    }
}
