package com.vinayak;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        // Question link -> https://leetcode.com/problems/concatenation-of-array/
        int[] arr = {2, 3, 3};
        int [] ans = ansArray(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] ansArray(int[] arr) {
        int[] ans = new int[arr.length * 2];
        int index = 0;
        int count = 0;

        while (count < 2) {
            for (int i = 0; i < arr.length; i++) {
                 ans[index] = arr[i];
                 index++;
            }
            count++;
        }

        return ans;
    }
}
