package com.company.day9_recursion;

public class Result {

    public static int factorial(int n) {
        if (n <= 1) { return 1; }
        else { return n * factorial(n - 1); }
    }

}
