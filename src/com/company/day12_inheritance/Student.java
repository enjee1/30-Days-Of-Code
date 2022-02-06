package com.company.day12_inheritance;

class Student extends Person {
    private int[] testScores;


    Student(String firstName, String lastName, int idNumber, int[] scores) {
        super(firstName, lastName, idNumber);
        testScores = scores;
    }

    char calculate() {
        int sum = 0;

        for (int score : testScores) {
            sum += score;
        }
        int scoreAverage = sum / testScores.length;

        if (scoreAverage >= 90) {
            return 'O';
        } else if (scoreAverage >= 80) {
            return 'E';
        } else if (scoreAverage >= 70) {
            return 'A';
        } else if (scoreAverage >= 55) {
            return 'P';
        } else if (scoreAverage >= 40) {
            return 'D';
        } else {
            return 'T';
        }
    }

}
