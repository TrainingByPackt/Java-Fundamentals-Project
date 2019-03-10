package com.packt.jamescutajar.lesson3;

import java.util.Scanner;

public class LeapYearCheck {

    /**
     * Exercise for Lesson 3.
     * Implement this method as explained in the reading material
     */
    public boolean isLeapYear(int year) {
        if (year % 4 != 0) return false; //1997
        else if (year % 100 != 0) return true; //1996
        else if (year % 400 != 0) return false; //3000
        else return true; //2000
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year to check if it is a leap year or not");
        int year = scanner.nextInt();
        LeapYearCheck check = new LeapYearCheck();
        System.out.println("Year " + year + (check.isLeapYear(year) ? " is" : " is not") + " a leap year");
    }
}
