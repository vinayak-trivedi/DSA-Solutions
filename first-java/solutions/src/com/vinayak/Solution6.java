package com.vinayak;

import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INR to Dollar conversion");
        System.out.print("Enter currency in INR: ");
        int INR = input.nextInt();
        float dollar = (float)(INR / 79.92);
        System.out.println("INR " + INR + "is equal to " + dollar + " dollars");
    }
}
