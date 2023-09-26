package com.learn.a01oopextensdemo6;

public class manager extends Employee {
    public double bouns;

    public manager() {
    }

    // 带全部参数的构造
    // 父类 + 子类
    public manager(String id, String name, double salary, double bouns) {
        super(id, name, salary);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }


    @Override
    public void work() {
        System.out.println(super.getName() + "管理其他人");
    }
}
