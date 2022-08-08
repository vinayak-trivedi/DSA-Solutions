package com.vinayak;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int highestAltitude = highestAltitude(gain);
        System.out.println(highestAltitude);
    }

    static int highestAltitude(int[] gain) {
        int[] alitudesArr = new int[gain.length + 1];
        alitudesArr[0] = 0;

        for (int i = 1; i < gain.length; i++) {
            alitudesArr[i] = alitudesArr[i - 1] + gain[i -1];
        }
        return highestNumber(alitudesArr);
    }

    static int highestNumber(int[] arr) {
        int highest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > highest) {
                highest = arr[i];
            }
        }
        return highest;
    }
}
