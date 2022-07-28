package com.vinayak;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        // solution for question 9
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total runs scored by batsman: ");
        int runs = input.nextInt();
        System.out.print("Enter total times the batsman got out: ");
        int out = input.nextInt();

        int battingAverage = runs/out;
        System.out.println("Average: " + battingAverage);
    }
}
