package com.packt.jamescutajar.lesson6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LevenshteinDistanceTest {

    @Test
    public void testDistanceBookBack() {
        LevenshteinDistance levenshteinDistance = new LevenshteinDistance();
        assertEquals(2, levenshteinDistance.stringDistance("book", "back"));
    }

    @Test
    public void testDistanceFortuneForced() {
        LevenshteinDistance levenshteinDistance = new LevenshteinDistance();
        assertEquals(4, levenshteinDistance.stringDistance("fortune", "forced"));
    }

    @Test
    public void testDistancePillowOpinion() {
        LevenshteinDistance levenshteinDistance = new LevenshteinDistance();
        assertEquals(4, levenshteinDistance.stringDistance("pillow", "opinion"));
    }

    @Test
    public void testDistanceJackknifeApplejack() {
        LevenshteinDistance levenshteinDistance = new LevenshteinDistance();
        assertEquals(9, levenshteinDistance.stringDistance("jackknife", "applejack"));
    }

    @Test
    public void testDistanceEmptyAbc() {
        LevenshteinDistance levenshteinDistance = new LevenshteinDistance();
        assertEquals(3, levenshteinDistance.stringDistance("", "abc"));
    }

    @Test
    public void testDistanceAbcEmpty() {
        LevenshteinDistance levenshteinDistance = new LevenshteinDistance();
        assertEquals(3, levenshteinDistance.stringDistance("abc", ""));
    }

    @Test
    public void testDistanceSame() {
        LevenshteinDistance levenshteinDistance = new LevenshteinDistance();
        assertEquals(0, levenshteinDistance.stringDistance("abc", "abc"));
    }
}