package com.vinayak;

public class RotatedArrayBinarySearch {
    public static void main(String[] args) {
        // what is a rotated array
        // let's understand it with an example
        // suppose we have an array like this [1, 2, 3, 4, 5, 6]
        // and we put the item in the last index in the 0 index
        // so it becomes something like that [6, 1, 2, 3, 4, 5]
        // and  we do it one more time then it becomes [5, 6, 1, 2, 3, 4]
        // so this is what is called as rotation

        // so how do we find an element in a rotated array

        // if we observe the array we can see that the highest number is going to be the one which is from which
        // the array is rotated
        // and after that there is a drop
        // so we will find the peak in the array and search till peak
        // if we find the target element then we are done
        // if not then we find after the peak element

        int[] arr = {5, 6, 1, 2, 3, 4}; // rotated two times
        int target = 2;

        int peak = findPeak(arr);
        int firstTry = binarySearch(arr, target, 0, peak);

        if( firstTry != -1) {
            System.out.println(firstTry);
            System.out.println("Found the answer in first try!");
        } else {
            int ans = binarySearch(arr, target, peak + 1, arr.length -1);
            System.out.println(ans);
        }
    }

    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) /2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[start] < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid; // we are doing mid here because we do not know if the previous element there is an answer
            }
        }
        return -1;
    }

    static int binarySearch(int arr[], int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // number not found
    }
}
