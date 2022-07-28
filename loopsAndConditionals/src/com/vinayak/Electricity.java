package com.vinayak;

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        // This is the solution for intermediate question 2(see quesitons.md)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter units used: ");
        int unit = input.nextInt();
        double bill = 0;
        if(unit >= 1 && unit <= 100) {
            bill = unit * 4.02;
        } else if(unit >= 101 && unit <= 200) {
            bill = unit * 5.02;
        } else if(unit >= 201 && unit <= 300) {
            bill = unit * 5.87;
        } else {
            bill = unit * 6;
        }
        System.out.println("Bill: " + bill);
    }
}
