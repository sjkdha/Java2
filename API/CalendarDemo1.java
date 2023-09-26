package com.learn.API;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {
        // Calendar是一个抽象类,不能直接new 而是通过静态方法获取到子类对象
        // Calendar 代表了系统当前时间的日历对象,可以单独修改,获取时间中的年月日
        Calendar instance = Calendar.getInstance();

        // 修改日历代表的时间
        Date d = new Date(0L);
        instance.setTime(d);

        System.out.println(instance);

        // 修改时间
        instance.set(Calendar.YEAR, 2023);
        instance.set(Calendar.MONTH, 6);
        instance.set(Calendar.DAY_OF_MONTH, 3);


        // 在此基础上增加一个月
        // instance.add(Calendar.MONTH,-1);


        int year = instance.get(Calendar.YEAR);
        int month = instance.get(Calendar.MONTH) + 1;
        int Day = instance.get(Calendar.DATE);
        int week = instance.get(Calendar.DAY_OF_WEEK);

        System.out.println(year + ", " + month + ", " + Day + ", " + getWeek(week));
    }

    // 查表法
    public static String getWeek(int week) {
        String[] arr = {"", "周日", "周一", "周二", "周三", "周四", "周五", "周六"};
        return arr[week];
    }
}
