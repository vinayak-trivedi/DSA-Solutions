package com.vinayak;

public class BookAllocationProblem {
    /*
    Question: We are given an array arr, which contains the page number of ith book, number of students m we need to allocate the books amongs m students so that:
    1. Every student gets a book
    2. and each book is distributed
    we need to see every possibility of distribution and then we need to compare the maximum page in each case with each other and give out the smallest number among them
    Let's understand it better with an example
    we have a book page array like this => [20, 10, 30, 40]
    we have m i.e students => 2
    we will look at each possiblity of distribution
    sum =>             20    80   max => 80
    first possibility 20 | 10 30 40
    sum =>             30     70   max => 70
    second possibitiy 20 10 | 30 40
    sum =>               60       40   max => 60
    third possibility  20 10 30 | 40
    so we need to return 60 which is smallest in all these maximums
    Although, we can do by the following approach =>
    1. figure out the the possible distribution in all the cases
    2. find the maximum of all the cases
    3. campare the maximum of all the cases and return the minimum one
    But there is a better way to do that, we can use binary search here
    */

    // mentioned my approach explanation in the js version of this solution
    public static void main(String[] args) {
        int[] arr = {10, 30, 20, 40};
        int m = 2; // number of students

        int ans = findAns(arr,m);
        System.out.println("ans: " +  ans);
    }

    static int findAns(int[] arr, int m) {
        int start = 0;
        int sum = 0;

        for (int i: arr) {
            sum += i;
        }

        int end = sum;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) /2;

            if (isPossibleSolution(arr, m, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    static boolean isPossibleSolution(int[] arr, int m, int mid) {
        int student = 1;
        int pageSum = 0; // this will used to determine if we have exceeded the page limit

        for (int i = 0; i < arr.length; i++) {
            if (pageSum + arr[i] <= mid) {
                pageSum += arr[i];
            } else {
                student++; // we are now giving the books to second student
                if (student > m || arr[i] > mid) {
                    return false;
                }
                pageSum = arr[i];
            }
        }
        return true;
    }
}