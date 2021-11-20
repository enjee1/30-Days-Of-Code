package com.company.day14scope;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] numbers) {
        elements = numbers;
    }

    public void computeDifference() {
        int difference = 0;
        for (int i = 0; i < elements.length ; i++) {
            for (int j = i + 1; j < elements.length ; j++) {
                difference = Math.abs(elements[i] - elements[j]);
                if (difference > maximumDifference ) {
                    maximumDifference = difference;

                }
            }
        }

    }


}