package com.vinayak;

public class Question11 {
    // Question
    // Print
    // * * * *
    // * * *
    // * *
    // *

    public static void main(String[] args) {
        int n = 4;
        int i = 0;

        while (i < n) {
            int j = 0;
            while (j < n - i) {
                System.out.print("*" + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
