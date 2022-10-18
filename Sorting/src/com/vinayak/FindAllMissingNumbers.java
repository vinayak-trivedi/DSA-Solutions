package com.vinayak;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(FindMissingNumbers(arr));

    }

    static List<Integer> FindMissingNumbers(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {
                swap(arr, correctIndex, i);
            } else {
                i++;
            }
        }
        List<Integer> answer = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                answer.add(index + 1);
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
