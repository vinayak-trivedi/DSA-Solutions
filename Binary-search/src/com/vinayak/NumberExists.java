package com.vinayak;

public class NumberExists {

    public static void main(String[] args) {
        // find if a number exist in a given array using binary search
        int[] arr = {1, 4, 7, 8, 9, 10, 12, 15, 20};
        int target = 22;
        boolean numberExists = isNumberExisting(arr, target);
        System.out.println(numberExists);
    }

    static boolean isNumberExisting(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // considering that array is ascending
        while (start <= end) {
            int mid = start + (end - start) /2;
            if(arr[mid] < target) {
                start = mid + 1;
            } else if(arr[mid] > target) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
