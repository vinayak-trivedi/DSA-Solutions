package com.vinayak;

public class Question12 {
    public static void main(String[] args) {
        // print
        // * * * *
        //   * * *
        //     * *
        //       *

        int n = 4;
        int i = 0;

        while (i < n) {
            int space = 0;
            // when i is 0 space is 0 and star is n
            // when i is 1 space is 1 and star is n - 1;
            // when i is 2 space is 2 and star is n -2
            // when i is 3 space is 3 and star is n - 3

            while (space < i) {
                System.out.print(" ");
                space++;
            }
            int star = 0;
            while (star < n - i) {
                System.out.print("*");
                star++;
            }
            System.out.println();
            i++;
        }
    }
}
