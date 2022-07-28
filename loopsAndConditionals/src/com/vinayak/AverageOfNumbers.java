package com.vinayak;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        // This is the solution for Java intermediate question 3(question.md)
        Scanner input = new Scanner(System.in);
        int total = 0;
        int n = 0;
        int average = 0;
        while (true) {
            System.out.print("Enter a number! Press 0 to get the average of numbers entered till then: ");
            int number = input.nextInt();

            if(number == 0) {
                if(n == 0) {
                    System.out.println("No number entered!! Exiting...");
                    break;
                } else {
                    average = total / n;
                    System.out.println("Average: " + average);
                    break;
                }
            } else {
                total = total + number;
                n += 1;
            }
        }

    }
}
