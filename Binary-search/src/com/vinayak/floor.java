package com.vinayak;

public class floor {
    public static void main(String[] args) {
        // we have to find the greatest number smaller or equal to target
        // suppose we have array {1,2, 3,4, 5, 7}
        // here the target element is 6,
        // 6 doesn't exist in the array as we can see
        // so it will return index of 5 which is the greatest number smaller than target in the array.

        int[] arr = {1, 2, 3, 5, 6, 7, 9};
        int target = 8;
        int ans = findFloor(arr, target);
        System.out.println(ans);
    }

    static int findFloor(int[] arr, int target) {
        // index= 0, 1, 2, 3, 4, 5, 6
        // arr = {1, 2, 3, 5, 6, 7, 9}
        // target = 8;

        // this loop will run until start <= end

        // first iteration
        // mid = 3 => number = 5
        // is arr[mid] == target // false
        // is arr[mid] greater than target // false
        // is arr[mid] smaller than target // true => start = mid + 1 => 4;

        // second iteration
        // mid = 5 => number = 7;
        // is arr[mid] == target // false
        // is arr[mid] greater than target // false
        // is arr[mid] smaller than target // true => start = mid + 1 => 6

        // third iteration
        // mid = 6 => number = 9 // here both start and end are equal
        // is arr[mid] == target // false
        // is arr[mid] greater than target // true => end = mid - 1 => 5
        // here start becomes greater than end // end is 5 and start is 6
        // now we are out of loop and we will return end, why? start = end + 1, and the number doesn't exist so if the number
        // existed it would have been existing between those number only, and since we need to return the greatest number smaller than
        // our target if the target doesn't exist we will return end;

        // code below
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) /2;
            if (arr[mid] < target) {
                start =  mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end;
    }


}
