package com.tdd.fibonacci;

public class Fibonacci {
    public int getFibonacci(int i) {
        int resultFibonacci = 0;

        if (i == 0)
            return 0;
        if (i == 1)
            return 1;
        if (i >= 2) {
            resultFibonacci = getFibonacci(i - 1) + getFibonacci(i - 2);
        }

        return resultFibonacci;
    }
}
