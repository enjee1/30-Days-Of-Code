package com.company.day10_binary_numbers;
import java.io.*;

import static java.util.stream.Collectors.joining;


public class Day10BinaryNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        System.out.println(Day10BinaryNumbers.numConsecutiveOnes(n));
    }

    public static int numConsecutiveOnes(int num) {
        int counter = 0, max =0;

        while (num > 0) {
            int rem = num % 2;
            if (rem == 1) counter++;
            else counter = 0;
            max = Math.max(counter, max);
            num /= 2;
        }

        return max;
    }
}