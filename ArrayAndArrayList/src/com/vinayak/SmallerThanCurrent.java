package com.vinayak;

import java.util.Arrays;

public class SmallerThanCurrent {
    public static void main(String[] args) {
        // Question link -> https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
        int[] arr = {8,1,2,2,3};
        int[] ans = ansArr(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] ansArr(int[] arr) {
        int count = 0;
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] < arr[i]) {
                    count = count + 1;
                }
            }
            newArr[i] = count;
            count = 0;
        }
        return newArr;
    }
}
