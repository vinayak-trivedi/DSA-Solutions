package com.vinayak;

public class EvenDigits {
    public static void main(String[] args) {
        // Question link -> https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
        int[] arr = {12, 342, 2345, 4343};
        int numbersWithEvenDigtis = NumberWithEvenDigits(arr);
        System.out.println(numbersWithEvenDigtis);

    }
    static int NumberWithEvenDigits(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (isEvenDigits(j)) {
                count++;
            }
        }
        return count;
    }

    static boolean isEvenDigits(int number) {
        int digits = 0;

        while(number > 0) {
            number = number /10;
            digits++;
        }
        return digits % 2 == 0;
    }
}
