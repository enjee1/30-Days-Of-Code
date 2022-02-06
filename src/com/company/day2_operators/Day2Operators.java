package com.company.day2_operators;

import static java.util.stream.Collectors.joining;

public class Day2Operators {

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
        double totalTip = ((double)tip_percent / 100) * meal_cost;
        double totalTax = ((double)tax_percent / 100) * meal_cost;
        System.out.println(Math.round(meal_cost + totalTip + totalTax));
    }
}






