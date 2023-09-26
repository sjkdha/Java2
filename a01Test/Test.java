package com.learn.a01Test;

public class Test {
    public static void main(String[] args) {
        pingPongPlayer pingPongPlayer = new pingPongPlayer("张三", 23);
        System.out.println(pingPongPlayer.getName() + ", " + pingPongPlayer.getAge());
        pingPongPlayer.study();
        pingPongPlayer.English();
    }
}
