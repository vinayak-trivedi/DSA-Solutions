package com.vinayak;

import java.util.Arrays;

public class Matrix {
    // Question link -> https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 0},
                {0, 0, 0}
        };
        int[][] indices = {
                {0, 1},
                {1, 1}
        };
        int oddnumbers = findOdd(arr, indices);
        System.out.println(oddnumbers);
    }

    static int findOdd(int[][] arr, int[][] indicesArr) {
        int rowIndex;
        int columnIndex;
        for (int i = 0; i < indicesArr.length; i++) {
            rowIndex = indicesArr[i][0];
            columnIndex = indicesArr[i][1];

            for (int j = 0; j < arr[rowIndex].length; j++) {
                arr[rowIndex][j]++;
            }
            for (int j = 0; j < arr.length; j++) {
                arr[i][columnIndex]++;
            }
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
