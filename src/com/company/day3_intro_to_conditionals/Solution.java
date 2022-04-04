package com.company.day3_intro_to_conditionals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        if (n % 2 == 1 || (n > 5 && n < 21)) { System.out.println("Weird"); }
        else { System.out.println("Not Weird"); }

        bufferedReader.close();
    }
}
