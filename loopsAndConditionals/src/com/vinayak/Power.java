package com.vinayak;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        // Solution for question 7
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();

        double power = Math.pow(a, b);
        System.out.print(a + " to the power " + b + ": " + power);
    }
}
