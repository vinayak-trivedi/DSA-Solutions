package com.vinayak;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = 0;

        while(true) {
            System.out.print("Enter a number! Enter 0 to get the largest number till that point: ");
            int number = input.nextInt();
            if(number == 0) {
                System.out.println("Largest number till now: " + largest);
                break;
            } else if(number > largest) {
                largest = number;
            }
        }
    }
}
