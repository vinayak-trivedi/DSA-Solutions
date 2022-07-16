package com.vinayak;

import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
