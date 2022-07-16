package com.vinayak;

import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string to know if it is a palindrome: ");
        String string = input.nextLine();
        String reversed = "";

        for(int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            reversed = ch+reversed;
        }

        if(string.equals(reversed)) {
            System.out.println("The given string is a palindrome string");
        } else {
            System.out.println("The given string is not a palindrome string");
        }

    }
}
