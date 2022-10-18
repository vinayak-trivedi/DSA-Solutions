package com.vinayak;

import java.util.Arrays;

public class CyclicSortBasic {
    public static void main(String[] args) {
        int[] arr = {5, 3 ,1, 2, 4};
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, correctIndex, i);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
