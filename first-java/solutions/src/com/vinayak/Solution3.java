package com.vinayak;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        int p = input.nextInt();
        System.out.print("Enter Rate of Interest: ");
        int r = input.nextInt();
        System.out.print("Enter Time period: ");
        int t = input.nextInt();
        float SI = p * r/100 * t;
        System.out.println("Simple Interest:" + SI);
    }
}
