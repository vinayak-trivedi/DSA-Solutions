package com.vinayak;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 8;
        int[] ans = findNumberIn2dArr(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findNumberIn2dArr(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if(arr[row][column] == target) {
                    // it will be returning the row and column in which the number was found
                    return new int[]{row, column};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
