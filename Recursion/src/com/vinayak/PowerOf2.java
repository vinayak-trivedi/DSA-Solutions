package com.vinayak;

import java.util.Scanner;

public class PowerOf2 {
    // take an input,n from user and return 2 to the power n using recursion
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get the 2 to the power that nubmer: ");
        int input = sc.nextInt();

        int answer = power(input);
        System.out.println(answer);
    }

    static int power(int input) {
        if (input == 0) {
            return 1;
        }

        return 2 * power(input - 1);
    }

    // Explanation for each iteration of the power function

    // Suppose the user puts an input 3

    // first case
        /*
         input => 3
          is base case(input == 1) true => no
          // returns 2 * power(input - 1)
          why?
          let's understand with the example below
          if we have n = 3
          so the answer will be 2 * 2  * 2
          we know that 2 * 2 * 2 can also be written as 2 * (2 * 2) in bracket we have power of 2 = n - 1
          so this can also be written as 2 * (2)to the power n -1

          that is why we can call that function again to break that problem into smaller problem

          now this function will not be returned immediately => it will rest in the call stack until the call for
          power(input - 1) is completed
        */

    // second case

        /*
            n = 2
            is base case true => no
            return 2 * power(n -1)
            this will also not return immediately, this will wait for the next call to complete, so this will rest in the call
            stack till the next call is completed
        */

    // third case

        /*
           n = 1
           is base case true = no
           returns 2 * power(n - 1)
           this will also wait for the next function to complete until then it rests in the call stack
         */

    // fourth case

    /*
        n = 0
        is base case true => yes
        returns 1 to the third case
        // then the third case will do 2 * 1 => 2 to the second case
        // which will return 2 * 2 => 4 to the first case
        // which will return 8 to the answer variable in the main function and our answer will get printed
    */
}
