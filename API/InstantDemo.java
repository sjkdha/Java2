package com.learn.API;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo {
    public static void main(String[] args) {
        // instant时间戳

        // 获取当前世界标准时间
        Instant now = Instant.now();
        System.out.println(now);

        // 根据(秒/毫秒/纳秒)获取instant对象
        Instant instant1 = Instant.ofEpochMilli(0L);
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);

        Instant instant3 = Instant.ofEpochSecond(1L, 1000000000L);
        System.out.println(instant3);

        // 获取指定时区的时间
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);

        // isXXX  判断
        Instant instant4 = Instant.ofEpochMilli(0L);
        Instant instant5 = Instant.ofEpochMilli(1000L);

        boolean result1 = instant4.isBefore(instant5);
        System.out.println(result1); // true 表示instant4在5的前面

        boolean after = instant4.isAfter(instant5);
        System.out.println(after); // false 表示instant 不在5的后面
    }
}
