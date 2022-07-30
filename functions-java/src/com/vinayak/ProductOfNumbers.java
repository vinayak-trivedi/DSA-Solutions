package com.vinayak;

import java.util.Scanner;

public class ProductOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two numbers to get it's product");

        System.out.print("First number: ");
        int num1 = in.nextInt();
        System.out.print("Second number: ");
        int num2 = in.nextInt();

        int product = product(num1, num2);
        System.out.println("The product of " + num1 + " and " + num2 + " is " + product);
    }
    static int product(int a, int b) {
        return  a * b;
    }
}
