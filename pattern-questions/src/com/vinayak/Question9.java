package com.vinayak;

public class Question9 {
    public static void main(String[] args) {
        // Question
        // Print
        // A B C
        // B C D
        // C D E

        int n = 3;
        int i = 0;

        while (i < n) {
            int j = 0;
            while (j < n) {
                System.out.print((char)(65 + i + j) + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
