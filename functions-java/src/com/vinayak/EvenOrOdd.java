package com.vinayak;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to know if it is even or odd: ");
        int num = in.nextInt();
        boolean isEven = FindEven(num);

        if(isEven) {
            System.out.println("The provided number is an even number");
        } else {
            System.out.println("The provided number is not an even number");
        }
    }
    static boolean FindEven(int a) {
      if(a % 2 == 0) {
          return true;
      }
      return false;
    }
}
