package com.vinayak;

import java.util.Scanner;

public class Solution9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter first number: ");
        int num2 = input.nextInt();

        for(int i = num1; i <= num2; i++) {
            int checknum, rem, sum = 0;
            checknum = i;

            while(checknum != 0) {
                rem = checknum % 10;
                sum = sum + (rem * rem * rem);
                checknum = checknum / 10;
            }
            if(sum == i) {
                System.out.println(i + " is a armstrong number");
            }
        }

    }
}
