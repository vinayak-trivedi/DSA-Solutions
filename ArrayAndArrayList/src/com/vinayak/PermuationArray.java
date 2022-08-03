package com.vinayak;

import java.util.Arrays;

public class PermuationArray {
    public static void main(String[] args) {
        // Question link: https://leetcode.com/problems/build-array-from-permutation/
        int[] arr = {0,2,1,5,3,4};
        int [] ans = answerArry(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] answerArry(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[arr[i]];
        }
        return ans;
    }
}

