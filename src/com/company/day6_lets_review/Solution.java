package com.company.day6_lets_review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i = 0; i < n; i++) {
            String s = bufferedReader.readLine();

            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    System.out.print(s.charAt(j));
                }
            }

            System.out.print(" ");

            for (int k = 0; k < s.length(); k++) {
                if (k % 2 == 1) {
                    System.out.print(s.charAt(k));
                }
            }

            System.out.println();
        }

        bufferedReader.close();
    }
}
