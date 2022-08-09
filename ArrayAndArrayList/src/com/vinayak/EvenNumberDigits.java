package com.vinayak;

public class EvenNumberDigits {
    // Question link -> https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public static void main(String[] args) {
        int[] arr = {555,901,482,1771};
        int NumberWithEvenDigits = evenDigits(arr);
        System.out.println(NumberWithEvenDigits);
    }

    static int evenDigits(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            String StringInteger = Integer.toString(nums[i]);
            if(StringInteger.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
