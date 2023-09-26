package com.learn.doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class pokerGame {
    // 利用序号进行排序
    // 创建hashMap集合,来创建序号和牌的关系
    // 创建单列集合,来存储序号,因为要对序号进行操作,最后才通过序号来找到牌
    static HashMap<Integer, String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();

    // 定义一个序号

    static {
        int serialNumber = 1;
        // 准备牌
        String[] color = {"♠", "♥", "♣", "♦"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        for (String n : number) {
            for (String c : color) {
                hm.put(serialNumber, c + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        // 添加大王
        hm.put(serialNumber, "大王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber, "小王");
        list.add(serialNumber);
    }

    public pokerGame() {
        // 洗牌
        Collections.shuffle(list);

        // 发牌
        // 定义四个TreeSet集合,因为这个单列集合有自动排序的特点
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            int serialNumber = list.get(i);
            if (i <= 2) {
                lord.add(serialNumber);
                continue;
            }
            if (i % 3 == 0) {
                player1.add(serialNumber);
            } else if (i % 3 == 1) {
                player2.add(serialNumber);
            } else {
                player3.add(serialNumber);
            }
        }
        // 看牌
        seeLord("底牌", lord);
        seeLord("张三", player1);
        seeLord("李四", player2);
        seeLord("王五", player3);
    }

    public static void seeLord(String name, TreeSet<Integer> ts) {
        System.out.print(name + ":");
        for (int serialNumber : ts) {
            String Poker = hm.get(serialNumber);
            System.out.print(Poker + " ");
        }
        System.out.println();
    }
}
