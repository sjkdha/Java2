package com.learn.day3;

public class demo {
        public static void main(String[] args) {
            int[] arr = {10, 11, 13, 14, 15};
            int score = 12;
            int[] arr2 = new int[arr.length + 1];
            for (int i = 0; i < 3; i++) {
                arr2[i] = arr[i];
                System.out.println(arr2[i]);
            }
            arr2[2] = score;
            for (int i = 3; i < arr2.length; i++)
            {
                arr2[i] = arr[i - 1];
                System.out.println(arr2[i]);
            }

            System.out.print("before:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ",");
            }
            System.out.println();
            System.out.print("after:");
            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i] + ",");
            }
        }
}
