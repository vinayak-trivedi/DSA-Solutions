package com.vinayak;

import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        // This is the solution for question 22(check question.md)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = input.nextInt();
        int sum = 0;
        int product = 1;

        while(number != 0) {
            int rem = number % 10;
            product = product * rem;
            sum = sum + rem;
            number = number/10;
        }
        int productandsumdifference = product - sum;
        System.out.println("Result: " + productandsumdifference);
    }
}
