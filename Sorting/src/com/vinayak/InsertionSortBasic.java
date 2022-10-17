package com.vinayak;

import java.util.Arrays;

public class InsertionSortBasic {
    public static void main(String[] args) {
        int[] arr = {5, 1, 15, 11, 18};
        System.out.println("unsorted array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] > arr[j - 1]) {
                    break;
                }
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
        System.out.println("sorted array: " + Arrays.toString(arr));
    }
}
