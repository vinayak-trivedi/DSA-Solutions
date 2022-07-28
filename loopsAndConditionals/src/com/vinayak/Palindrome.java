package com.vinayak;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to know if it is a palindrome: ");
        int number = input.nextInt();
        int temp = number;
        int reversed = 0;

        while(number != 0) {
            int rem = number % 10;
            reversed = reversed * 10 + rem;
            number = number/10;
        }

        if(temp == reversed) {
            System.out.println(temp + " is a palindrome number");
        } else {
            System.out.println(temp + " is not a palindrome number");
        }
    }
}
