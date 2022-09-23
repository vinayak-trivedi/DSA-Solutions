package com.vinayak;

public class Question3 {
    public static void main(String[] args) {
        // Question
        // Print
        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4

        // solution

        int n = 4;
        int i = 1;

        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print(i + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
