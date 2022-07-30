package com.vinayak;

import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to know if the triplet is a pythagorean triplet");

        System.out.print("First number: ");
        int a = in.nextInt();
        System.out.print("Second number: ");
        int b = in.nextInt();
        System.out.print("Third number: ");
        int c = in.nextInt();

        boolean isPythagorean = isPythagoreanTriplet(a, b, c);

        if(isPythagorean) {
            System.out.println("The triplet is a pythagorean triplet");
        } else {
            System.out.println("The triplet is not a pythagorean triplet");
        }
    }

    static boolean isPythagoreanTriplet(int a, int b, int c) {
        int sumOfSquare= (a * a) + (b * b);
        int squareofthird = c * c;

        return sumOfSquare == squareofthird;
    }
}
