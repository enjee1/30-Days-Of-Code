package com.company;
import java.util.*;

public class Day12Inheritance {
}

    class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification){
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson(){
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + 	"\nID: " + idNumber);
        }

    }

    class Student extends Person {
        private int[] testScores;


        Student(String firstName, String lastName, int idNumber, int[] scores){
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
    class Solution {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String firstName = scan.next();
            String lastName = scan.next();
            int id = scan.nextInt();
            int numScores = scan.nextInt();
            int[] testScores = new int[numScores];
            for (int i = 0; i < numScores; i++) {
                testScores[i] = scan.nextInt();
            }
            scan.close();

            Student s = new Student(firstName, lastName, id, testScores);
            s.printPerson();
            System.out.println("Grade: " + s.calculate());

        }
    }




