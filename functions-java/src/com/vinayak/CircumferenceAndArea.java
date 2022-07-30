package com.vinayak;

import java.util.Scanner;

public class CircumferenceAndArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius to know the area and circumference of circle: ");
        int r = in.nextInt();
        double area = area(r);
        double circumference = circumference(r);

        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }

    static double area(int radius) {
        return  3.14 * radius * radius;
    }

    static  double circumference(int radius) {
        return 2 * 3.14 * radius;
    }
}
