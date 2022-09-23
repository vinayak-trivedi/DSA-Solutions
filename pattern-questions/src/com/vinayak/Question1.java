package com.vinayak;

public class Question1 {

    public static void main(String[] args) {
	    // question :
        /*  Print
            1 2 3 4
            1 2 3 4
            1 2 3 4
            1 2 3 4
        * */
        int n = 4;
        int i = 1;

        while (i <= n) {
            int j = 1;
            while (j <= 4) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
