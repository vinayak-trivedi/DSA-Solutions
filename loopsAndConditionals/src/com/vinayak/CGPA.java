package com.vinayak;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        // solution for question 10
        Scanner input = new Scanner(System.in);

        System.out.println("Enter grade of each subject(1 - 10)");
        System.out.print("English: ");
        float eng = input.nextFloat();
        System.out.print("Maths: ");
        float math = input.nextFloat();
        System.out.print("Accountancy: ");
        float acc = input.nextFloat();
        System.out.print("Economics: ");
        float eco = input.nextFloat();
        System.out.print("Business Studies: ");
        float Bst = input.nextFloat();

        float total = eng + math + acc + eco + Bst;
        float CGPA = total / 5;
        System.out.println("CGPA: " + CGPA);
    }
}
