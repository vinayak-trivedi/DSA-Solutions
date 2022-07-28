package com.vinayak;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        // Solution for question 8
        Scanner input = new Scanner(System.in);

        System.out.print("Enter cost of asset: ");
        int costOfAsset = input.nextInt();
        System.out.print("Enter rate of depreciation: ");
        int rateOfDep = input.nextInt();

        int depreciation = costOfAsset * rateOfDep/100;
        System.out.println("Depreciation: " + depreciation);
    }
}
