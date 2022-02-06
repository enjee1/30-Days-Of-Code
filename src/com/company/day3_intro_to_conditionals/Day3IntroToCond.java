package com.company.day3_intro_to_conditionals;
import java.io.*;

import static java.util.stream.Collectors.joining;


public class Day3IntroToCond {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        if (n % 2 == 1 || (n > 5 && n < 21)) System.out.println("Weird");
        else System.out.println("Not Weird");

        bufferedReader.close();
    }
}
