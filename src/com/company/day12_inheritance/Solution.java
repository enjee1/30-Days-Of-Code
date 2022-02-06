package com.company.day12_inheritance;


import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the student's first name:");
        String firstName = scan.next();
        System.out.println("Enter the student's last name:");
        String lastName = scan.next();
        System.out.println("Enter the student's ID number:");
        int id = scan.nextInt();
        System.out.println("Enter the number of scores:");
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            System.out.println("Enter a score:");
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());

    }
}
