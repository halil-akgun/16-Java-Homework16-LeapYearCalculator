package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                if (year % 4000 == 0) {
                    System.out.println(year + " is not a leap year");
                } else {
                    System.out.println(year + " is a leap year");
                }
            } else {
                System.out.println(year + " is not a leap year");
            }
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}