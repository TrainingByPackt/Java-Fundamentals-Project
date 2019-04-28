package com.packt.jamescutajar.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramSolverTest {

    private AnagramSolver anagramSolver = null;
    private String input = "stressed\ndesserts\npager\nrelic\nempty\n";

    @BeforeEach
    public void setup() throws IOException, ParseException {
        try {
            anagramSolver = (AnagramSolver) Class.forName("com.packt.jamescutajar.project.AnagramSolverImpl").getDeclaredConstructor(String.class).newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException
                | InvocationTargetException | ClassCastException e) {
            fail("For this test to work you need to declare a class with the exact name and package 'com.packt.jamescutajar.project.AnagramSolverImpl'. " +
                    "It also needs to have an empty constructor");
        }
        ByteArrayInputStream bin = new ByteArrayInputStream(input.getBytes());
        anagramSolver.loadWords(bin);
    }

    @Test
    public void testLoadWordsInvalidInputNumber() throws IOException{
        String invalidInput = "hello\nwonder\nnumber1\n";
        ByteArrayInputStream bin = new ByteArrayInputStream(invalidInput.getBytes());
        try {
            anagramSolver.loadWords(bin);
            fail("loadWords method should throw a ParseException when the input contains a numeric character");
        } catch (ParseException e) {
            assertEquals(2, e.getErrorOffset(), "Error offset of parse exception should contain the correct line number");
        }
    }

    @Test
    public void testLoadWordsInvalidInputUppercase() throws IOException{
        String invalidInput = "hello\nwonder\nUPPERCASE\n";
        ByteArrayInputStream bin = new ByteArrayInputStream(invalidInput.getBytes());
        try {
            anagramSolver.loadWords(bin);
            fail("loadWords method should throw a ParseException when the input contains an uppercase");
        } catch (ParseException e) {
            assertEquals(2, e.getErrorOffset(), "Error offset of parse exception should contain the correct line number");
        }
    }

    @Test
    public void testLoadWordsInvalidInputDot() throws IOException{
        String invalidInput = "hello\nwonder\nd.o.t.s\n";
        ByteArrayInputStream bin = new ByteArrayInputStream(invalidInput.getBytes());
        try {
            anagramSolver.loadWords(bin);
            fail("loadWords method should throw a ParseException when the input contains a character not in a..z");
        } catch (ParseException e) {
            assertEquals(2, e.getErrorOffset(), "Error offset of parse exception should contain the correct line number");
        }
    }


    @Test
    public void testPickRandom() throws IOException, ParseException {
        char[] chars = anagramSolver.pickRandomArrangement().toCharArray();
        Arrays.sort(chars);
        boolean valid = false;
        for (String str: input.split("\n")) {
            char[] charsWrod = toString().toCharArray();
            Arrays.sort(charsWrod);
            if (Arrays.equals(charsWrod, chars)) valid = true;
        }
        assertTrue(valid, "The method pickRandomArrangement is not returning a valid result. It should return a random shuffle of a word it the given dictionary");
    }

    @Test
    public void testValidateBadAttemptWrongWord() {
        assertFalse(anagramSolver.validateAttempt("dsteress","testwrong"), "Validate attempt should return false when the wrong attempt is given");
    }

    @Test
    public void testValidateBadAttemptDictWord() {
        assertFalse(anagramSolver.validateAttempt("dsteress","empty"), "Validate attempt should return false when the wrong attempt is given");
    }

    @Test
    public void testValidateBadAttemptNonDictWord() {
        assertFalse(anagramSolver.validateAttempt("dsteress","dseretss"), "Validate attempt should return false when the wrong attempt is given");
    }

    @Test
    public void testValidateCorrectAttempt() {
        assertFalse(anagramSolver.validateAttempt("dsteress","stressed"), "Validate attempt should return true when the correct attempt is given");
    }

    @Test
    public void testFindSolutions() {
        HashSet<String> solutions = new HashSet<>(anagramSolver.findSolutions("dsteress"));
        HashSet<String> expected = new HashSet<>(Arrays.asList("stressed", "desserts"));
        assertEquals(expected, solutions);
    }

    @Test
    public void testFindSolutionsNonExistant() {
        List<String> solutions = anagramSolver.findSolutions("abc");
        assertTrue(solutions.isEmpty(), "The find solutions method should return empty when no match is found in the dictionaries");
    }
}
