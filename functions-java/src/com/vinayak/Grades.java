package com.vinayak;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks to know your grades: ");

        int marks = in.nextInt();
        defineGrades(marks);
    }

    static void defineGrades(int marks) {
        if(marks <= 100 && marks >= 91) {
            System.out.println("Grade: AA" );
        } else if(marks <= 90 && marks >= 81) {
            System.out.println("Grade: AB");
        } else if(marks <= 80 && marks >= 71) {
            System.out.println("Grade: BB");
        } else if(marks <= 70 && marks >= 61) {
            System.out.println("Grade: BC");
        } else if(marks <= 60 && marks >= 51) {
            System.out.println("Grade: CD");
        } else if(marks <= 50 && marks >= 41) {
            System.out.println("Grade: DD");
        } else {
            System.out.println("Sorry! You have failed the exam");
        }
    }
}
