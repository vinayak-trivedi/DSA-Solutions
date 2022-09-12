package com.vinayak;

public class searchInString {

    public static void main(String[] args) {
        String str = "vinayak";
        char c = 'c';
        System.out.println(isCharPresent(str, c));
    }

    static boolean isCharPresent(String str, char c) {
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }
}
