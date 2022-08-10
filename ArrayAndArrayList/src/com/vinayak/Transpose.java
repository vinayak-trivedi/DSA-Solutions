package com.vinayak;

import java.util.Arrays;

public class Transpose {
    // Question link -> https://leetcode.com/problems/transpose-matrix/
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] ansArr = transpose(matrix);
        for (int i = 0; i < ansArr.length; i++) {
            System.out.println(Arrays.toString(ansArr[i]));
        }
    }

    static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] newArr = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                newArr[i][j] = matrix[j][i];
            }
        }
        return newArr;
    }
}
