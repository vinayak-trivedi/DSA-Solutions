package com.vinayak;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "hello";
        boolean allcharacterPresent = containsAllCharacter(sentence);
        if(allcharacterPresent) {
            System.out.println("All characters are present");
        } else {
            System.out.println("All character are not present");
        }
    }

    static boolean containsAllCharacter(String s) {
        boolean containsAllCharacter = true;
        for (char i = 'a'; i <= 'z'; i++) {
            if(!s.contains(String.valueOf(i))) {
                containsAllCharacter = false;
                break;
            }
        }
        return containsAllCharacter;
    }

}
