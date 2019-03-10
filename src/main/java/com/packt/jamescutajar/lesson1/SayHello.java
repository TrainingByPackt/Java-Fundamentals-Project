package com.packt.jamescutajar.lesson1;

import java.util.Scanner;

/**
 * Exercise for Lesson 1.
 * Implement main method as explained in the material accompanying this course
 */
public class SayHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.next();
        System.out.println("Hello " + name + "!");
        System.out.println("Your name is " + name.length() + " characters long");
    }
}
