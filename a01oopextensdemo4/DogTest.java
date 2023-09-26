package com.learn.a01oopextensdemo4;

public class DogTest {
    public static void main(String[] args) {
        Husky h = new Husky();
        h.breakHome();
        h.eat();
        h.drink();
        h.lookHome();

        SharPei s = new SharPei();
        s.eat();
        s.drink();
        s.lookHome();

        ChinaDog c = new ChinaDog();
        c.eat();
        c.drink();
        c.lookHome();
    }
}
