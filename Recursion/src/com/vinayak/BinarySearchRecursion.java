package com.vinayak;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target = 66;
        int ans = binarySearchRecursion(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }
    static int binarySearchRecursion(int[] arr, int target, int start, int end) {

        // base case
        if (start > end) {
            return - 1;
        }

        int mid = start + (end - start)/2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] > target) {
           return binarySearchRecursion(arr, target, start, mid - 1);
        }

        return binarySearchRecursion(arr, target, mid + 1, end);
    }
}
