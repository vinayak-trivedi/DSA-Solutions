package com.vinayak;

public class findDuplicate {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        System.out.println("Duplicate number: " + findDuplicateNumber(arr));
    }

    static int findDuplicateNumber(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correctIndex = arr[i] - 1;
                // this can happen in two cases, one where we don't have the element in the correct index, or
                // this is a duplicate element

                if (arr[i] != arr[correctIndex]) {
                    swap(arr, correctIndex, i);
                } else {
                    return arr[i]; // it means that it is duplicate so we return it
                }
            } else {
                i++;
            }
        }
        return -1; // it means we did not find the number
    }

    static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
