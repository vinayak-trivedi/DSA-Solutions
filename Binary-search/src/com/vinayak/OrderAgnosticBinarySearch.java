package com.vinayak;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        // in order agnostic binary search we don't knwo if the array that we have is in ascending or descending order.
        // first we will dtermine if the array is in ascending or descending order

        int[] arr = {10, 9, 8, 7, 6, 4, 3, 1, 0};
        boolean isAscending = isAscending(arr);
        // then we will find the number in the array and give the index at which that array exists
        int target = 0;
        int ans = binarySearch(arr, target, isAscending);
        System.out.println(ans);
    }

    static boolean isAscending(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        return arr[start] < arr[end];
    }

    static int binarySearch(int[] arr, int target, boolean isAscending) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) /2;
            if(arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if(arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if(arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
