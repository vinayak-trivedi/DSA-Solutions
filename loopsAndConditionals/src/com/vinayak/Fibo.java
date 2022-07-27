package com.vinayak;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        // This is the solution for question no.21(refer questions.md)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to get the Fibonacci series");
        int n = input.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);

        for(int i = 2; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
    }
}
