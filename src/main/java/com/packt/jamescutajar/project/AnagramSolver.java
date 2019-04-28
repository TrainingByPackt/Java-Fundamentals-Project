package com.packt.jamescutajar.project;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.List;

/**
 * Final Project
 * Implement the methods in this interface as outlined in the reading material
 */
public interface AnagramSolver {

    /**
     * This method accepts a textInput containing a list of english words
     * Each word in the file should be on a separate line and only contain
     * valid lower case characters [a..z]
     * The method should throw a ParseException if this is not the case
     * Once the words are loaded, they need to be stored in efficient
     * data structures so they can be used as a dictionary in the other methods.
     */
    void loadWords(InputStream textInput) throws ParseException, IOException;

    /**
     * This method selects a random word from the list of words loaded
     * in the loadWords method. Then it shuffles the characters creating
     * a different string. For example, after picking the word "sunny" the string
     * is shuffled resulting in the arrangement of "nysnu".
     */
    String pickRandomArrangement();

    /**
     * This method validates attempts of solving the anagram. For example
     * given the inputs of "nysnu" and "sunny" it checks if
     * "nysnu" and "sunny" are anagrams of each other and that "sunny" is
     * contained in the existing dictionary of words (loaded from word file
     * in the loadWords method).
     */
    boolean validateAttempt(String characters, String attempt);

    /**
     * This method accepts a string containing characters and returns a list of possible solutions.
     * For example
     *    findSolutions("eapgr") should return [gaper, grape, pager, parge]
     *    findSolutions("aaaaa") should return [] //empty list if it cannot find any match
     *
     * A fast implementation of the AnagramSolver will not require
     * this method to go through every word in the dictionary, but instead use an
     * efficient algorithm and data structure to look up all the possible solutions.
     */
    List<String> findSolutions(String characters);
}
