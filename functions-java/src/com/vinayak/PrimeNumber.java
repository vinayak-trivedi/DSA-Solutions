package com.vinayak;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to know if it's a prime number: ");
        int num = in.nextInt();
        boolean isPrime = isPrime(num);

        if(isPrime) {
            System.out.println("The provided number is a prime number");
        } else {
            System.out.println("The provided number is not a prime number");
        }
    }
    static boolean isPrime(int num) {
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
