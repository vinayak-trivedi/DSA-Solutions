package com.vinayak;

import java.util.Scanner;

public class PrimeBetweenTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number to know the prime numbers between them");
        System.out.print("First number");
        int a = in.nextInt();
        System.out.print("Second number");
        int b = in.nextInt();
        printPrime(a, b);
    }

    static void printPrime(int a, int b) {
        while( a <  b) {
            boolean isPrime = isPrime(a);
            if(isPrime) {
                System.out.print(" " + a);
            }
            a++;
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
