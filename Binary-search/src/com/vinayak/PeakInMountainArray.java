package com.vinayak;

public class PeakInMountainArray {
    public static void main(String[] args) {
        // find peak in moutain array
        // A mountain is an array which is increasing till a point and then it decreases, the number before the point
        // at which it decreases is the peak
        int[] arr = {7, 8, 9, 10, 11, 4, 5 ,6};
        int ans = findPeak(arr);
        System.out.println(ans);
    }

    static int findPeak(int[] arr) {
        // so supposing that our array is an asceding array, till the peak point it will be increasing and after the
        // peak point it will be decreasing, so if we check that if arr[index] > arr[index + 1] then we have found
        // our peak

        // code
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) { // we have found our peak at this point
                return mid;
            } else if (arr[start] < arr[mid]) { // this means that we are on the side of the array which is before the peak
                start = mid + 1;
            } else { // case where the start > arr[mid] which means we are on the other side of peak
                end = mid - 1;
            }
        }
        return -1; // This means that we have not found the peak in the array
    }
}
