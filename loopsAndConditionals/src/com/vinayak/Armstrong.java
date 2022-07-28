package com.vinayak;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to know if it is armstrong number: ");
        int number = input.nextInt();
        int rem = 0;
        int sum = 0;
        int temp = number;
        while(number != 0) {
            rem = number % 10;
            sum = sum + (rem * rem * rem);
            number = number/10;
        }
        if(sum == temp) {
            System.out.print(temp + " is an armstrong number");
        } else {
            System.out.println(temp + " is not an armstrong number");
        }
    }
}
