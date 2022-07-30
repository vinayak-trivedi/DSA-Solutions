package com.vinayak;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the age to know if the person is eligible to give vote: ");
        int age = in.nextInt();
        boolean canVote = above18(age);

        if(canVote) {
            System.out.print("The person can vote");
        } else {
            System.out.println("The person cannot vote");
        }
    }
    static boolean above18(int age) {
        return age > 18;
    }
}
