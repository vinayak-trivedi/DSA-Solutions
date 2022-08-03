package com.vinayak;

import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        // Question link -> https://leetcode.com/problems/running-sum-of-1d-array/
        int[] arr = {1, 2, 3, 4};
        int[] ans = ansArr(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] ansArr(int[] arr) {
        int sum = 0;
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            ans[i] = sum;
        }
        return ans;
    }
}
