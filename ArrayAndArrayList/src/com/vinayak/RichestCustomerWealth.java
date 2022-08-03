package com.vinayak;

public class RichestCustomerWealth {
    // Question link -> https://leetcode.com/problems/richest-customer-wealth/
    public static void main(String[] args) {
        // Supposing we have two customers and the first array
        // is the wealth of the first customer and the second array is the wealth of second customer
        int[][] arr = {
                {1,2,3,5},
                {2,4,5,6}
        };
        int richest = getRichest(arr);
        System.out.println(richest);
    }
    static int getRichest(int[][] arr) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            if(sum > max) {
                max = sum;
                sum = 0;
            }
        }
        return max;
    }
}
