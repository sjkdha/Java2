package com.learn.a02staticdemo2;

public class ArrayUtil {

    // 私有化构造方法
    // 为了不让外界创建它的对象
    private ArrayUtil() {
    }

    // 定义为静态的,方便调用
    // 遍历数组
    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append((arr[i])).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    // 求平均
    public static double getAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double v = sum / arr.length;
        return v;
    }
}
