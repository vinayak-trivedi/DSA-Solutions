package com.vinayak;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int number = 3;
        int answer = SearchNumberIndex(arr, number, 0, 1);
        System.out.println(answer);
    }

    static int SearchNumberIndex(int[] arr, int number, int start, int end) {
        for (int i = start; i <= end; i++) {
            if(arr[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
