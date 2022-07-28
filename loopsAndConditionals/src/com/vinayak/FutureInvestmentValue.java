package com.vinayak;

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        // This is solved based on the assumption that the investor gets a consistent percentage of ROI every year on a given investment
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the current investment amount: ");
        int currentInvestment = input.nextInt();
        System.out.print("Enter the rate of expected return: ");
        int rateOfReturn = input.nextInt();
        System.out.print("Enter the years for which you will hold the investment: ");
        int investmentYears = input.nextInt();

        int interestEarned = 0;

        for(int i = 0; i < investmentYears; i++) {
            interestEarned = currentInvestment * 10/100;
            currentInvestment = currentInvestment + interestEarned;
        }

        System.out.println("Current investment after " + investmentYears + " years is: " + currentInvestment);

    }
}
