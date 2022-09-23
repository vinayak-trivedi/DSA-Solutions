package com.vinayak;

public class Question5 {
    public static void main(String[] args) {
        // Question
        // Print
        // A A A
        // B B B
        // C C C

        int n = 3;
        int i = 0;

        while (i < n) {
            int j = 0;
            while (j < n) {
                System.out.print((char)(65 + i));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
