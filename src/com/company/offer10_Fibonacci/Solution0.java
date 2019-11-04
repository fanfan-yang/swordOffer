package com.company.offer10_Fibonacci;

public class Solution0 {

    public static long fibonacci (int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long fibNMinusOne = 1;
        long fibNMinusTwo = 0;

        long fib = 1;
        for (int i = 2; i <= n; i++) {
            fib = fibNMinusOne + fibNMinusTwo;
            fibNMinusOne = fib;
            fibNMinusTwo = fibNMinusOne;
        }
        return fib;
    }
}
