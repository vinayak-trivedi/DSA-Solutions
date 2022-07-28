package com.vinayak;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        // Solution for question 5 intermediate java
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of first point: ");
        int a = input.nextInt();
        System.out.print("Enter the value of second point: ");
        int b = input.nextInt();

        double distance = Math.sqrt((a * a) + (b * b));
        System.out.println("Distance: " + distance);
    }
}
