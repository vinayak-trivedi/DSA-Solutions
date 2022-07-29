package com.vinayak;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Three numbers to know the minimum and maximum number among them");
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        System.out.print("Enter third number: ");
        int c = input.nextInt();
        int min = min(a, b, c);
        int max = max(a, b, c);
        System.out.println("Max:" + max);
        System.out.println("Min: " + min);
    }
    static int min(int num1, int num2, int num3) {
      int min = Math.min(num1, num2);
      min = Math.min(min, num3);
      return min;
    }
    static int max(int num1, int num2, int num3) {
        int max = Math.max(num1, num2);
        max = Math.max(max, num3);
        return max;
    }
}
