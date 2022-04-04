package com.company.day2_operators;

public class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        double tipTotal = meal_cost * ((double)tip_percent / 100);
        double taxTotal = meal_cost * ((double)tax_percent / 100);
        System.out.println(Math.round(meal_cost + tipTotal + taxTotal));

    }


}

