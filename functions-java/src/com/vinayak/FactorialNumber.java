package com.vinayak;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to know it's factorial: ");
        int num = in.nextInt();
        int factorial = factorial(num);

        System.out.println("The factorial of " + num + " is " + factorial);
    }

    static int factorial(int num) {
        int factorialProduct = 1;
        for(int i = 1; i <= num; i++) {
            factorialProduct = factorialProduct * i;
        }
        return factorialProduct;
    }
}
