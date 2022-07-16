package com.vinayak;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find the bigger number");
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        if(num1 > num2) {
            System.out.println("First number is bigger");
        } else {
            System.out.println("Second number is bigger");
        }
    }
}
