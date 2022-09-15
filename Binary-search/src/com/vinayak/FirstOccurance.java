package com.vinayak;

public class FirstOccurance {
    public static void main(String[] args) {
        // we need to find the first of a number which has more than one repetition in the array.
        int[] arr = {1, 2, 5, 7, 7, 7, 7, 9, 10};
        int target = 7;
        int firstOccuranceIndex = findFirstOccurance(arr, target);
        System.out.println(firstOccuranceIndex);
    }

    static int findFirstOccurance(int[] arr, int target) {
        // index = {0, 1, 2, 3, 4, 5, 6, 7, 8}
        // array = {1, 2, 5, 7, 7, 7, 7, 9, 10}

        // first iteration
        // mid = 4 => number = 7;
        // is number == target // true => {
        //  we will not return the index here what we will do is save this index in a variable, this is our potential answer of the
        // first iteration of the number
        // and then we do end = mid - 1; => 3 because we want to find the first iteration of that number
        // }

        // second iteration
        // mid = 1 => number = 2
        // is number == target // false
        // is number greater than target // false
        // is number smaller than target // true => start = mid + 1; => 2

        // third iteration
        // mid = 2 => number 5
        // is number == target // false
        // is number greater than target // false
        // is number smaller than target // true => start = mid + 1 => 3

        // fourth iteration
        // mid = 3  => number = 7 // at this point our start is equal to end
        // is number == target // true => {
        //  update the variable which contains the answer for the first iteration
        // then update end = mid - 1 => 2
        // }

        // now start > end, so the loop will break
        // and we will return the variable which contains the answer for the first iteration in this case the variable contains
        // the index 3;

        // code below

        int start = 0;
        int end = arr.length -1;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) /2;
            if (arr[mid] == target) {
                ans = mid; // saving the potential answer
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid + 1;
            }
        }
        return ans;
    }
}
