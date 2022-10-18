package com.vinayak;

public class MissingNumber {
    // given an array which is in the range 0 to n we need to find the missing number
    // Question link => https://leetcode.com/problems/missing-number/

    // first we will sort the array using cyclic sort and then we will check which is number is not present in it's current index
    public static void main(String[] args) {
        int[] arr = {4, 0, 1, 2};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, correctIndex, i);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
