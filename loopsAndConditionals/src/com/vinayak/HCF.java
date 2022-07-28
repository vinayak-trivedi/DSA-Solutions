package com.vinayak;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find HCF between two numbers");
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        int result = Math.min(a, b);

        while(result < 0) {
            if(a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        System.out.println("HCF: " + result);
    }
}
