package com.vinayak;

public class Question8 {
    public static void main(String[] args) {
        // Question
        // Print
        // A B C
        // D E F
        // G H I

        int n = 3;
        int i = 0;
        int count = 0;

        while (i < n) {
            int j = 0;
            while (j < n) {
                System.out.print((char)(65 + count) + " ");
                count++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
