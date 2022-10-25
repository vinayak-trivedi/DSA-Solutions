package com.vinayak;

public class Factorial {

    public static void main(String[] args) {
	    // we need to find the factorial of a number, we will use recursion here
        // recursion is basically a function calling itself
        // what is factorial?
        // factorial is the factor of all the positive integer numbers smaller than n
        // for ex => factorial of 5 => 5 * 4 * 3 * 2 * 1 = 120

        // solution for factorial

        int n = 5;
        int ans = factorial(n);
        System.out.println(ans);
    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    // Explanation of the solution above

    // our function factorial takes in a number n and gives the factorial of that particular number
    // suppose the number is 3 than the function will return 6 which is factorial of 3

    // we are using recursion here
    // how does the function above works?

    // To understand how this function is working interally let's see how this function works in case of a function with n = 3

    /*
    - call made with 3 first it checks if the base case(if n = 0 ) is true then it return 1;
    if not it returns n * factorial(n - 1), this is going to return anything for now as another call is made to factorial
    - this function gets stored in the call stack

    - in the next call which is made above with n - 1 which is 4, we again check if  the base case is true
    - it is not in this case as well
    - we return n * factorial(n - 1), this is going to return anything for now as another call is made to factorial
    - this function also gets stored in the call stack

    - now n = 1
    - base case = false
    - then we return n * factorial(n-1)
    - this function call also gets stored in the call stack and we go to the next call

    - now n = 0
    - base case = true
    - we return 1;
    - now the previous function gets 1;
    - so in the case where n was 1, we get factorial(n-1) = 1 so, it return n * 1 which is 1

    - now the function which called that particular iteration of the function which was the function which has the value
    n = 2, get 1, now from there we return n * 1 which is 2

    - now the function which called the above function which was the same function with value n = 3 gets 2
    - it returns n * 2 which is 6
    - now all the function are out of the call stack so 6 is our answer




    */
}
