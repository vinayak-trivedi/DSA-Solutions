package com.vinayak;

public class DaysAllowed {
    public static void main(String[] args) {
        int daysInAugust = 31;
        int daysallowed = 0;

        for(int i = 0; i <= daysInAugust; i++) {
            if(i % 2 == 0) {
                daysallowed++;
            }
        }
        System.out.println("No of days allowed in August: " + daysallowed);
    }
}
