package com.company.day6_lets_review;

import java.io.*;
import java.util.*;


public class Day6LetsReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = Integer.parseInt(scanner.nextLine().trim());

        for (int i = 0; i < counter; i++) {
            String input = scanner.nextLine();
            String[] inputArr = input.split("");
            System.out.println(splitStringAtIndexes(inputArr));
        }
    }

    public static String splitStringAtIndexes(String[] orgString) {
        String oddIndex = "";
        String evenIndex = "";

        for (int i = 0; i < orgString.length ; i++) {
            if (i % 2 == 0) { evenIndex += orgString[i]; }
            else { oddIndex += orgString[i]; }
        }

        return evenIndex + " " + oddIndex;
    }
}
