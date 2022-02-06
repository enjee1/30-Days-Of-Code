package com.company.day9_recursion;

import java.io.*;
import java.util.Scanner;

public class Day9Recursion3 {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter a digit then press enter to display the factorial of the digit:\n>>");
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine().trim());

        int result = factorial(n);
        System.out.println(result);

    }

    private static int factorial(int n) {
        if (n <= 1) return 1;
        else return n * factorial(n - 1);
    }


}
