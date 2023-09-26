package com.learn.doudizhu1;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    static ArrayList<String> list = new ArrayList<>();

    static {
        // ♠ ♥ ♣ ♦
        // 3 4 5 6 7 8 9 10 J Q K A 2
        // 准备牌
        String[] color = {"♠", "♥", "♣", "♦"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        // 牌盒
        for (String c : color) {
            // c:表示每一种花色
            for (String n : number) {
                // n:表示每一个数字
                list.add(n + c);
            }
        }
        list.add("大王");
        list.add("小王");
    }

    public PokerGame() {
        // 洗牌
        // 打乱集合顺序
        Collections.shuffle(list);

        // 发牌
        // 准备四个集合装三个玩家的牌和底牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        // 遍历牌库
        for (int i = 0; i < list.size(); i++) {
            String Pork = list.get(i);
            if (i <= 2) {
                lord.add(Pork);
                continue;
            }
            if (i % 3 == 0) {
                // 发给player1
                player1.add(Pork);

            } else if (i % 3 == 1) {
                // 发给player2
                player2.add(Pork);

            } else {
                // 发给player3
                player3.add(Pork);
            }
        }

        // 写一个方法看牌
        seePoke("底牌",lord);
        seePoke("刚脑壳", player1);
        seePoke("大帅比", player2);
        seePoke("蛋筒", player3);
    }

    public static void seePoke(String player, ArrayList<String> list) {
        System.out.print(player + ": ");
        for (String Poke : list) {
            System.out.print(Poke + " ");
        }
        System.out.println();
    }
}
