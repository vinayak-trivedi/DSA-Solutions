package com.vinayak;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers to find their sum");
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("Sum of the two numbers: " + sum);
    }
}
