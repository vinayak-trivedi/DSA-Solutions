package com.vinayak;

import java.util.Arrays;

public class TargetArrayInorder {
    // Question link -> https://leetcode.com/problems/create-target-array-in-the-given-order/
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ansArr = ansArr(nums, index);
        System.out.println(Arrays.toString(ansArr));
    }

    static int[] ansArr(int[] nums, int[] index) {
        int[] ansArr = new int[nums.length];

        // Supposing that both arrays have same length we can do the following
        for (int i = 0; i < index.length; i++) {
            int j = index.length - 1;
            while(j > index[i]) {
                ansArr[j] = ansArr[j - 1];
                j--;
            }
            ansArr[index[i]] = nums[i];
        }
        return ansArr;
    }
}
