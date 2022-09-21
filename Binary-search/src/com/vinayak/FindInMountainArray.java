package com.vinayak;

public class FindInMountainArray {
    public static void main(String[] args) {
        // we need to find for an element in a mountain array,
        // first we find the peak in the array using bs
        // then we check till the peak index using bs
        // then we check after the peak index till the end

        int[] arr = {7, 8, 9, 10, 3, 4, 5, 6};
        int target = 4;
        int peak = findPeak(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if (firstTry != -1 ) {
            System.out.println(firstTry);
            System.out.println("found in first try");
        } else {
            System.out.println(binarySearch(arr, target, peak + 1, arr.length -1));
        }

    }

    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            int mid = start + (end - start) /2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[start] < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) /2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // element not found
    }
}
