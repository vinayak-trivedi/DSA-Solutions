package com.vinayak;

import java.util.Scanner;

public class Commision {
    public static void main(String[] args) {
        // Solution for intermediate java question 6
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Total Sales: ");
        int totalSales = input.nextInt();
        System.out.print("Enter commission percentage: ");
        int commissionRate = input.nextInt();

        int commission = totalSales * commissionRate/100;
        System.out.println("Commission: " + commission);
    }
}
