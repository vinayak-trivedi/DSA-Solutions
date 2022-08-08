package com.vinayak;

import java.util.Arrays;

public class InvertImage {
    // Question link -> https://leetcode.com/problems/flipping-an-image/
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0},
                {1,0,1},
                {0,0,0},
        };
        imageinvert(arr);
    }

    static void imageinvert(int[][] arr) {
        int[][] ansArr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                ansArr[i][j] = arr[i][arr[i].length - 1 - j];
                if (ansArr[i][j] == 0) {
                    ansArr[i][j] = 1;
                } else {
                    ansArr[i][j] = 0;
                }
            }
        }
        printArr(ansArr);
    }
    static void printArr(int[][] arr) {
        System.out.print('[');
        for (int[] ints : arr) {
            System.out.print(Arrays.toString(ints));
            System.out.print(',');
        }
        System.out.print(']');
    }
}
