package com.vinayak;

public class GoodPairs {
    public static void main(String[] args) {
        // Question link -> https://leetcode.com/problems/number-of-good-pairs/
        int[] arr = {1, 1, 1, 1};
        int count = goodPairCount(arr);
        System.out.println(count);
    }
    static int goodPairCount(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
