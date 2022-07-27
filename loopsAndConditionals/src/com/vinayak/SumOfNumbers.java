package com.vinayak;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        // This is the solution for quesiton 24
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while(true) {
            System.out.print("Enter a number! Press 0 to get the sum at any point ");
            int number = input.nextInt();
            if(number == 0) {
                System.out.println("Sum: " + sum);
                break;
            }
            sum = sum + number;
        }
    }
}
