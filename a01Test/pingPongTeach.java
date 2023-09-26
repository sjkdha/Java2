package com.learn.a01Test;

public class pingPongTeach extends Teach implements speakEnglish {
    public pingPongTeach() {
    }

    public pingPongTeach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教打乒乓球");
    }

    @Override
    public void English() {
        System.out.println("乒乓球教练说英语");
    }
}
