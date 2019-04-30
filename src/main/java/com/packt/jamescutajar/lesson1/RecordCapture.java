package com.packt.jamescutajar.lesson1;

import java.util.Scanner;

/**
 * Exercise for Lesson 1.
 * Implement main method as explained in the material accompanying this course
 */
public class RecordCapture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Welcome to the Vinyl Record Store's Capture Screen ***");
        System.out.println();
        System.out.println("What is the album name?");
        String albumName = scanner.nextLine();
        System.out.println("What is the name of the Artist?");
        String artistName = scanner.nextLine();
        System.out.println("How many tracks does the album have?");
        int tracks = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is the name of the label?");
        String labelName = scanner.nextLine();
        System.out.println("Which year was this album released?");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        System.out.println("Album card");
        System.out.println("----------");
        System.out.println(String.format("Album name: \"%s\"", albumName));
        System.out.println(String.format("Artist: \"%s\"", artistName));
        System.out.println(String.format("Total Tracks: \"%s\"", tracks));
        System.out.println(String.format("Label: \"%s\"", labelName));
        System.out.println(String.format("Year Released: \"%s\"", year));
    }
}
