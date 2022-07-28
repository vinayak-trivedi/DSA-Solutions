package com.vinayak;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find the LCM between two numbers");
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        int result = Math.max(a, b);

        while(true) {
            if(result % a == 0 && result % b == 0) {
                break;
            }
            result++;
        }
        System.out.println("LCM: " + result);
    }
}
