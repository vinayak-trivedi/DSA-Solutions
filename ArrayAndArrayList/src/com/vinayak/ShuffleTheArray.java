package com.vinayak;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] ans = ansArr(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] ansArr(int[] arr) {
        int x = 0;
        int y = arr.length/2;
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) {
                newArr[i] = arr[x];
                x++;
            } else {
                newArr[i] = arr[y];
                y++;
            }
        }
        return newArr;
    }
}
