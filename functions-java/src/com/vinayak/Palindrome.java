package com.vinayak;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to know if it's a palindrome or not: ");
        int num = in.nextInt();
        boolean ispalindrome = isPalindrome(num);

        if(ispalindrome) {
            System.out.println("The provided number is a palindrome");
        } else {
            System.out.println("The provided number is not a palindrome");
        }

    }

    static boolean isPalindrome(int num) {
        int temp = num;
        int rem = 0;
        int reversed = 0;
        while(num > 0) {
            rem = num % 10;
            reversed = reversed * 10 + rem;
            num = num/10;
        }
        return temp == reversed;
    }
}
