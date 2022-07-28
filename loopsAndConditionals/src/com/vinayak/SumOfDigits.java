package com.vinayak;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to get the sum of it's digits: ");
        int num = input.nextInt();
        int rem = 0, sum = 0;

        while(num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num/10;
        }
        System.out.println("The sum of all the digits of the number: " + sum);
    }
}
