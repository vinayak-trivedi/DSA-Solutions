package com.vinayak;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter Second number: ");
        int num2 = input.nextInt();
        System.out.println("Enter an operator: ");
        char operator = input.next().charAt(0);

        if(operator == '+') {
            int result = num1 + num2;
            System.out.println("Result: " + result);
        } else if(operator == '-') {
            int result = num1 - num2;
            System.out.println("Result: " + result);
        } else if(operator == '/') {
            int result = num1/num2;
            System.out.println("Result: " + result);
        } else if(operator == '*') {
            int result = num1 * num2;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid operator provided");
        }
    }
}
