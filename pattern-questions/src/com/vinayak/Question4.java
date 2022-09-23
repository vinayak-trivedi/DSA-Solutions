package com.vinayak;

public class Question4 {
    public static void main(String[] args) {
        // Question
        // Print
        // 1
        // 2 1
        // 3 2 1
        // 4 3 2 1

        int n = 4;
        int i = 1;

        while (i <= 4) {
            int j = 0;
            while (j < i) {
                System.out.print((i - j) + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
