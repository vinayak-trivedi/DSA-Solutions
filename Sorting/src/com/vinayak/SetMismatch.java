package com.vinayak;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 2};
        System.out.println(Arrays.toString(findSetMisMatch(arr)));
    }

    static int[] findSetMisMatch(int[] arr) {
        int i = 0;
        int[] answer = new int[2];

        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, correctIndex, i);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                answer[0] = arr[index];
                answer[1] = index + 1;
            }
        }

        return answer;
    }

    static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
