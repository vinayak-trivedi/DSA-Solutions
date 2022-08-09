package com.vinayak;

public class MatrixSum {
    // Question link -> https://leetcode.com/problems/matrix-diagonal-sum/
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };
        int sum = sumofMatrix(arr);
        System.out.println(sum);
    }

    static int sumofMatrix(int[][] arr) {
        int firstdiagonalindex = 0;
        // considering we have all the arrays of same length in the array
        int seconddiaglonalidnex = arr[0].length - 1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if(firstdiagonalindex == seconddiaglonalidnex) {
                sum += arr[i][firstdiagonalindex];
            } else {
                sum += arr[i][firstdiagonalindex] + arr[i][seconddiaglonalidnex];
            }
            firstdiagonalindex++;
            seconddiaglonalidnex--;
        }
        return sum;
    }
}
