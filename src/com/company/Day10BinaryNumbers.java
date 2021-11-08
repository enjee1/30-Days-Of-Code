package com.company;
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
        import static java.util.stream.Collectors.toList;



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