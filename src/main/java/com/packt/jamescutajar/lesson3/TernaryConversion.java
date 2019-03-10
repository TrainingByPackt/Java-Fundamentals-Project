package com.packt.jamescutajar.lesson3;

import java.util.Scanner;

public class TernaryConversion {

    /**
     * Exercise for Lesson 3.
     * Implement this convert method as explained in the reading material
     */
    public String convert(int decimal) {
        StringBuilder ternaryValue = new StringBuilder();
        while (decimal > 0) {
            ternaryValue.insert(0, (decimal % 3));
            decimal = decimal / 3;
        }
        if (ternaryValue.length() == 0) {
            return "0";
        }
        return ternaryValue.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number to convert to Ternary");
        int number = scanner.nextInt();
        System.out.println("Decimal Number " + number + " in ternary is " + new TernaryConversion().convert(number));
    }
}
