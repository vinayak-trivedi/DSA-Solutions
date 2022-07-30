package com.vinayak;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to get the sum of natural numbers till that number: ");
        int n = in.nextInt();
        int sum = sum(n);

        System.out.println("The sum of natural numbers till " + n + " is " + sum);
    }

    static int sum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
