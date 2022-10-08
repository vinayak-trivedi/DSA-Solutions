package com.vinayak;

public class sqrt {
    // we need to find the sqrt of a number
    // I've mentioned the approach in the JS solution in the same folder of binary search see there

    // we need to take long in case of java because the number can be bigger than 32 bit, that will cause an erro

    public static void main(String[] args) {
        int num = 16;
        int ans = findSqrt(num);

        System.out.println(ans);
    }

    static int findSqrt(int x) {
        long start = 0;
        long end = x;
        long ans = 0;

        if (x == 0) {
            return 0;
        }

        if (x == 1) {
            return 1;
        }

        while (start <= end) {
            long mid = start + (end - start) /2;
            long sqaure = mid * mid;

            if (sqaure == x) {
                return (int)mid;
            }

            if (sqaure < x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return (int)ans;
    }
}
