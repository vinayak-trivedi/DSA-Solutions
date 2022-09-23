package com.vinayak;

public class Question7 {
    public static void main(String[] args) {
        // Question
        // Print
        // A B C
        // A B C
        // A B C

        int n = 3;
        int i = 0;

        while (i < n) {
            int j = 0;
            while (j < n) {
                System.out.print((char)(65 + j));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
