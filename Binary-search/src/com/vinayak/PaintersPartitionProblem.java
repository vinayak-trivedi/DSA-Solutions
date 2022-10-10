package com.vinayak;

public class PaintersPartitionProblem {
/*
    Question: we are given an array of boards which contain the length of that board, we are also a value k which represents the number of workers present to paint all the board, each unit of board takes 1 unit of time to paint that board,

    we need to distribute the array between all the painters in such a way that it takes minimum time for each of them, one condition is that it should be distributed continuously.e.g if we have an 5 5 5 5 then it should be divided between both of them like this 5, 5 to first one and 5 5 to the second one or any other way but it has to be continuous

    POSSIBLE COMBINATIONS OF DISTRIBUTION

    sum => 5    15    max => 15
    1st => 5 | 5 5 5

    sum => 10    10    max => 10
    2nd => 5 5 | 5 5

    sum => 15    5    max => 15
    3rd => 5 5 5 | 5

    we can compare the max time for each of the case and then we can get the minimum time among them and that is the most feasible distribution, in our case it is the second one

    - HOW DO WE FIND IT?

    - we can do it by following approach
    - we make all the possible distributions
    - we find the maximum in each case
    - and then we return the minimum among them

    we can do this using binary search as well
    I 've written my solution appraoch in js solution for this
*/
    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 5};
        int k = 2;

        int ans = findAns(arr, k);
        System.out.println("answer: " + ans);
    }

    static int findAns(int[] arr, int k) {
        int start = 0;
        int sum = 0;
        int ans = 0;

        for (int i: arr) {
            sum += i;
        }

        int end = sum;

        while (start <= end) {
            int mid = start + (end - start) /2;

            if (isPossibleSolution(arr, mid, k)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    static boolean isPossibleSolution(int[] arr, int mid, int k) {
        int painter = 1;
        int timeTaken = 0;

        for (int i = 0; i < arr.length; i++) {
            if (timeTaken + arr[i] <= mid) {
                timeTaken += arr[i];
            } else {
                painter++;
                if (painter > k || arr[i] > mid) {
                    return false;
                }
                timeTaken = arr[i];
            }
        }
        return true;
    }
}
