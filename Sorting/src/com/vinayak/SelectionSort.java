package com.vinayak;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
	    // sort the following unsorted array using selection sort

        int[] array = {11, 4, 15, 8, 4, 6, 20};

        System.out.println("unsorted array: " + Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        System.out.println("sorted array: " + Arrays.toString(array));
    }
}
