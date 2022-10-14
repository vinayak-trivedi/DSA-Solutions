package com.vinayak;

import java.util.Arrays;

public class BubbleSortBasic {
    public static void main(String[] args) {
        // sort the given array using bubble sort
        int[] arr = {11, 8, 2, 22, 16, 7};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i ; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }


}
