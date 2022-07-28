package com.vinayak;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        // solution for question 11
        Scanner input = new Scanner(System.in);

        System.out.println("Find Compound Interest");
        System.out.print("Enter Initial Principal: ");
        int p = input.nextInt();
        System.out.print("Enter Rate of Interest: ");
        int r = input.nextInt();
        System.out.print("Enter Time period interest applied: ");
        int n = input.nextInt();
        System.out.print("Enter No. of time period elapsed: ");
        int t = input.nextInt();

        double CI = p * Math.pow((1 + r/n), n*t);
        System.out.println("Compound Interest: " + CI);
    }
}
