package com.vinayak;

import java.util.Arrays;

public class GreatestCandies {
    // Question link -> https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
    public static void main(String[] args) {
        int[] kidsCandies = {1, 3, 5, 2, 4};
        boolean[] ans = ansArr(kidsCandies);
        System.out.println(Arrays.toString(ans));
    }

    static boolean[] ansArr(int[] arr) {
        int extraCandies = 3;
        int max = maxCandies(arr);
        boolean[] boolArr = new boolean[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            boolArr[i] = arr[i] + extraCandies >= max;
        }
        return  boolArr;
    }

    static int maxCandies(int[] arr) {
        int max = 0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
