package com.vinayak;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to know if it is a perfect number: ");
        int number = input.nextInt();
        int sum = 0;

        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                sum = sum + i;
            }
        }
        if(number == sum) {
            System.out.println("The provided number is a Perfect number");
        } else {
            System.out.println("The provided number is not a perfect number");
        }
    }
}
