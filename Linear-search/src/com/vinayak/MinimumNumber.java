package com.vinayak;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 10, 0, 8};
        int minimum = findMinimum(arr);
        System.out.println(minimum);
    }

    static int findMinimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
