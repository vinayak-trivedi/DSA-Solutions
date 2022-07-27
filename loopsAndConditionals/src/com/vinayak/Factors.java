package com.vinayak;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        // This is the solution for question 23
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int count = 1;
        System.out.print("Factors: ");
        while(count <= number) {
            if(number % count == 0) {
                System.out.print(" " + count);
            }
            count++;
        }
    }
}
