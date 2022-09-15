package com.vinayak;

public class Ceiling {
    public static void main(String[] args) {
        // Smallest number in the array <= target
        int[] arr = {1, 2, 3, 4, 5, 7, 9};
        int target = 6;
        // we return the index of that number
        // if the number exists we return the index of that number
        // if the number doesn't exist then we return the number smallest in the array which is greater than the target.
        int ans = findCeling(arr, target);
        System.out.println(ans);
    }

    static int findCeling(int[] arr, int target) {
        // this loop will run till start <= end
        // 0, 1, 2, 3, 4, 5, 6 // these are the indexes
        // 1, 2, 3, 4, 5, 7, 9
        //target = 6;
        // first iteration
        // mid = 3
        // is number = target // false
        // is number greater than target // false
        // is number less than target // true => start = mid + 1; // start = 4

        // second iteration
        // mid = 5
        // is number = target // false
        // is number greater than target // true => end = mid - 1; // end = 4

        // third iteration
        // mid = 4;
        // is number = target // false
        // is number greater than target // false
        // is number smaller than target // true => start = mid + 1; // 5

        // now the loop has broken and we have not found the number which means the number doesn't exist in the array
        // so now we will return start. why? because we need to return the smallest number which is greater than the target
        // our start = end + 1; which means our number, if it existed lied between these two, and the greater index is start so we return the start
        // so in our case it will return 5;
        // code below

        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            int mid = start + (end - start) /2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
