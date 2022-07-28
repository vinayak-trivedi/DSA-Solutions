package com.vinayak;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to reverse it: ");
        String UserString = input.nextLine();
        String reversed = "";

        for(int i = 0; i < UserString.length(); i++) {
            char ch = UserString.charAt(i);
            reversed = ch + reversed;
        }
        System.out.println("Reversed string: " + reversed);
    }
}
