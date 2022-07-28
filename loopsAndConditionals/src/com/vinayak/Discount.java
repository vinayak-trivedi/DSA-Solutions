package com.vinayak;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        // Soution 4 of intermediate java programs
        Scanner input = new Scanner(System.in);

        System.out.print("Enter cost of product: ");
        int cost = input.nextInt();
        System.out.print("Enter discount percentage: ");
        int discountRate = input.nextInt();;

        int discountOnProduct = cost * discountRate/100;
        System.out.println("Discount provided: " + discountOnProduct);
    }
}
