package com.packt.jamescutajar.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.*;

public class AnagramSolverImpl implements AnagramSolver {
    private Set<String> allWords = new HashSet<>();
    private Map<String, List<String>> sortedCharsToWords = new HashMap<>();
    private ArrayList<String> wordList = new ArrayList<>();
    private Random rand = new Random();

    @Override
    public void loadWords(InputStream textInput) throws ParseException, IOException {
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(textInput));
        String word = fileReader.readLine();
        int lineNumber = 1;
        while (word != null) {
            if (!word.matches("[a-z]+"))
                throw new ParseException("input textfile should only contain lower case " +
                        "characters 'a' to 'z' at line number " + lineNumber, lineNumber);
            allWords.add(word);
            wordList.add(word);
            char[] characters = word.toCharArray();
            Arrays.sort(characters);
            String sortedChars = new String(characters);
            sortedCharsToWords.putIfAbsent(sortedChars, new ArrayList<>());
            sortedCharsToWords.get(sortedChars).add(word);
            word = fileReader.readLine();
            lineNumber++;
        }
    }

    @Override
    public String pickRandomArrangement() {
        int randPick = rand.nextInt(allWords.size());
        StringBuilder randWord = new StringBuilder(wordList.get(randPick));
        for (int i = randWord.length() - 1; i > 0; i--) {
            int randCharIdx = rand.nextInt(i + 1);
            char charPick = randWord.charAt(randCharIdx);
            randWord.setCharAt(randCharIdx, randWord.charAt(i));
            randWord.setCharAt(i, charPick);
        }
        return randWord.toString();
    }

    @Override
    public boolean validateAttempt(String characters, String attempt) {
        //First check if the attempt string has the same character count as the characters
        int[] charCount = new int[256];
        for (int i = 0; i < characters.length(); i++)
            charCount[characters.charAt(i)]++;
        for (int i = 0; i < attempt.length(); i++)
            charCount[attempt.charAt(i)]--;
        for (int i1 : charCount) if (i1 != 0) return false;
        //Then check if the attempt string exist in the dictionary
        return allWords.contains(attempt);
    }

    public List<String> findSolutions(String characters) {
        char[] chars = characters.toCharArray();
        Arrays.sort(chars);
        return sortedCharsToWords.get(new String(chars));
    }
}



