package com.vinayak;

public class FirstPositiveMissingNumber {
    // Question link => https://leetcode.com/problems/first-missing-positive/description/
    // approach is added in the js solution of the question

    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(findFirstPositive(arr));
    }

    static int findFirstPositive(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, correctIndex, i);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        return arr.length + 1;
    }

    static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

}
