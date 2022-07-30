package com.vinayak;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two numbers to know their sum");

        System.out.print("First number: ");
        int num1 = in.nextInt();
        System.out.print("Second number: ");
        int num2 = in.nextInt();

        int sum = add(num1, num2);

        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);

    }

    static int add(int a, int b) {
        int sum =  a +  b;
        return sum;
    }
}
