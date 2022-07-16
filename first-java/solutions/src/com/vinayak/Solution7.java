package com.vinayak;

import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int first = 0;
        int second = 1;
        int n = input.nextInt();

        System.out.print("The first " + n + " numbers in the Fibonacci series are: ");
        System.out.print(first + " ");
        System.out.print(second + " ");
        for(int i = 0; i < n - 2; i++) {
            int third = first + second;
            System.out.print(third + " ") ;
            first = second;
            second = third;
        }
    }
}
