package com.vinayak;

public class Question2 {
    public static void main(String[] args) {
        // Question
        /*
           Print
           *
           * *
           * * *
           * * * *
        *
      */
        int n = 4;
        int i = 1;

        while (i <= 4) {
            int j = 0;
            while (j < i) {
                System.out.print("*" + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
