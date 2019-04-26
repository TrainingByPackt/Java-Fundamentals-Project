package com.packt.jamescutajar.project;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

/**
 * Final Project
 * Implement the methods in this interface as outlined in the reading material
 */
public interface AnagramSolver {

    /**
     * This method accept a textFile that contains a list of english words
     * Each word in the file should be on a separate line and only contain
     * valid lower case characters [a..z]
     * The method should throw a ParseException if this is not the case
     * Once the words are loaded, they need to be stored in efficient
     * data structures so they can be used as a dictionary in the other methods.
     */
    void loadWords(File textFile) throws ParseException, IOException;

    /**
     * This method selects a random word from the list of words loaded
     * in the loadWords method. Then it shuffles the characters creating
     * an anagram. For example, after picking the word "sunny" the string
     * is shuffled resulting in the anagram of "nysnu".
     */
    String pickRandomAnagram();

    /**
     * This method validates attempts of solving the anagram. For example
     * given the inputs of "nysnu" and "sunny" it checks if
     * "nysnu" and "sunny" are anagrams of each other and that "sunny" is
     * contained in the existing dictionary of words (loaded from word file
     * in the loadWords method).
     */
    boolean validateAttempt(String anagram, String attempt);

    List<String> findSolutions(String anagram);
}
