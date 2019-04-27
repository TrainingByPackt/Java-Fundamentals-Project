package com.packt.jamescutajar.project;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.fail;

public class AnagramSolverTest {

    private AnagramSolver anagramSolver = null;

    @BeforeAll
    public void setup() throws IOException, ParseException {
        try {
            anagramSolver = (AnagramSolver) Class.forName("com.packt.jamescutajar.project.AnagramSolverImpl").getDeclaredConstructor(String.class).newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException
                | InvocationTargetException | ClassCastException e) {
            fail("For this test to work you need to declare a class with the exact name and package 'com.packt.jamescutajar.project.AnagramSolverImpl'. " +
                    "It also needs to have an empty constructor");
        }
        String input = "stressed\ndesserts\npager\nrelic\nempty\n";
        ByteArrayInputStream bin = new ByteArrayInputStream(input.getBytes());
        anagramSolver.loadWords(bin);
    }

    @Test
    public void testLoadWords(){

    }

    @Test
    public void testLoadWordsInvalidInput(){

    }



}
