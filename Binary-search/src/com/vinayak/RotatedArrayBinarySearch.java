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

        // first we will find the pivot in the array, which is the smallest number basically, let us understand with
        // an example how it helps
        // suppose we have a rotated array {5, 6, 1, 2, 3, 4}
        // so we find the pivot which is the smallest number which is going to be 1 in our case
        // we can observe here that we have two sorted array now, one which is from the 0th index till the pivot
        // and second which is from pivot + 1 index till arr.length -1;
        // so we will run binary search there

        // how will we find the pivot
        // supposing that we have two array/
        // all the elements in the first pivot are going to be bigger than all the elements in the second one
        // so our pivot will lie somewhere in the second pivot
        // so we check if the arr[0] <= arr[mid] in this case we are in the first sorted array, we need to move to
        // the next one, so we need to go ahead , so we do start = mid + 1;
        // else case is going to be the one where we are in the second array, then we will move the end below because
        // we want to get the smallest number there

        // this loop will run until start < end because when start = end which means that there is only one number left
        // in the array, which is going to be the smallest number because of the above conditions

        // code

        int[] arr = {4,5,6,7,0,1,2};

        int target = 1;

        int pivot = findPivot(arr);
        System.out.println(pivot);
        int firstTry = binarySearch(arr, target, 0, pivot - 1);
        if(firstTry != -1) {
            System.out.println(firstTry);
            System.out.println("found in first try");
        } else {
            System.out.println(binarySearch(arr, target, pivot, arr.length -1));
        }

    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[0] <= arr[mid]) { // we are in the part of the array which is before pivot
                start = mid + 1;
            } else {
                end = mid; // why we are taking mid because we don't know if the number is pivot so we will get to
                // place which is before the pivot which is not correct
            }
        }
        return start; // we can return anything start or end because they are same
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
