package com.learn.a02staticdemo2;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5,};
        String s = ArrayUtil.printArr(arr1);
        System.out.println(s);

        double[] arr2 = {1.1, 2.2, 3.3, 4.4, 5.5};
        double average = ArrayUtil.getAverage(arr2);
        System.out.println(average);
    }
}
