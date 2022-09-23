package com.vinayak;

public class Question10 {
    public static void main(String[] args) {
        // Question
        // Print
        //       *
        //     * *
        //   * * *
        // * * * *
        int n = 4;
        int i = 1;
        while (i <= n) {
            int space = 0;
            while (space < n - i) {
                System.out.print(" ");
                space++;
            }
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
