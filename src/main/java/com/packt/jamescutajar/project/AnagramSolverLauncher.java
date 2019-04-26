package com.packt.jamescutajar.project;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class AnagramSolverLauncher {
    public static void main(String[] args) throws IOException, ParseException {
        AnagramSolverImpl solver = new AnagramSolverImpl();
        solver.loadWords(new File("src/main/resources/fiveLetters.txt"));
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Welcome to Anagram Solver! ***");
        System.out.println("Can you solve the following anagram to make an english word?");
        String anagram = solver.pickRandomAnagram();
        int count = 1;
        boolean successful = false;
        String attempt = null;
        while (count <= 5 && !successful) {
            System.out.println("The anagram is: '" + anagram +
                    "', attempt " + count + " of 5");
            attempt = scanner.nextLine();
            successful = solver.validateAttempt(anagram, attempt);
            if (!successful)
                System.out.println("The word '" + attempt + "' is not in my dictionary!");
            count++;
        }
        if (successful) {
            System.out.println("The word '" + attempt + "' is a correct solution!");
            System.out.println("In my dictionary I have the following valid word(s): ");
            System.out.println(solver.findSolutions(anagram));
        } else {
            System.out.println("No more attempts available. The correct solution(s) are: ");
            System.out.println(solver.findSolutions(anagram));
        }
    }
}
