package com.packt.jamescutajar.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class AnagramSolverLauncher {

    /**
     * Implement a main method that behaves in the following manner using the
     * implementation for the AnagramSolver
     *
     * *** Welcome to Anagram Solver! ***
     * Can you rearrange these characters to make an english word?
     * The characters are: 'eapgr', attempt 1 of 5
     * gepra
     * The word 'gepra' is not in my dictionary!
     * The characters are: 'eapgr', attempt 2 of 5
     * pager
     * The word 'pager' is a correct solution!
     * In my dictionary I have the following valid word(s):
     * [gaper, grape, pager, parge]
     */
    public static void main(String[] args) throws IOException, ParseException {
        AnagramSolverImpl solver = new AnagramSolverImpl();
        solver.loadWords(new FileInputStream("src/main/resources/fiveLetters.txt"));
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Welcome to Anagram Solver! ***");
        System.out.println("Can you rearrange these characters to make an english word?");
        String chars = solver.pickRandomArrangement();
        int count = 1;
        boolean successful = false;
        String attempt = null;
        while (count <= 5 && !successful) {
            System.out.println("The characters are: '" + chars +
                    "', attempt " + count + " of 5");
            attempt = scanner.nextLine();
            successful = solver.validateAttempt(chars, attempt);
            if (!successful)
                System.out.println("The word '" + attempt + "' is not in my dictionary!");
            count++;
        }
        if (successful) {
            System.out.println("The word '" + attempt + "' is a correct solution!");
            System.out.println("In my dictionary I have the following valid word(s): ");
            System.out.println(solver.findSolutions(chars));
        } else {
            System.out.println("No more attempts available. The correct solution(s) are: ");
            System.out.println(solver.findSolutions(chars));
        }
    }
}
