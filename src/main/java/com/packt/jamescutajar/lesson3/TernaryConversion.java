package com.packt.jamescutajar.lesson3;

import java.util.Scanner;

public class TernaryConversion {

    /**
     * Exercise for Lesson 3.
     * Implement this convert method as explained in the reading material
     */
    public String convert(int decimal) {
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number to convert to Ternary");
        int number = scanner.nextInt();
        System.out.println("Decimal Number " + number + " in ternary is " + new TernaryConversion().convert(number));
    }
}
