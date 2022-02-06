package com.company.day16_exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day16Exceptions {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        try {
            System.out.println(Integer.parseInt(S));
        }
        catch (NumberFormatException nfe) {
                System.out.println("Bad String");
        }

        bufferedReader.close();
    }


}

