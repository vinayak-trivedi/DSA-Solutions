package com.vinayak;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter character to know if it's a vowel or consonant: ");
        String userInput = input.next().trim().toLowerCase();
        char ch = userInput.charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("The entered character is a vowel");
        } else {
            System.out.println("The entered character is a consonant");
        }
    }
}
