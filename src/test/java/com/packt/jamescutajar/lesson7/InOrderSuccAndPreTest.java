package com.packt.jamescutajar.lesson7;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InOrderSuccAndPreTest {
    @Test
    public void testSuccessor1234() {
        InOrderSuccAndPre inOrderSuccAndPre = new InOrderSuccAndPre(new Integer[]{4, 2, 3, 1});
        assertEquals(Optional.of(4), inOrderSuccAndPre.successor(3));
    }

    @Test
    public void testSuccessor124() {
        InOrderSuccAndPre inOrderSuccAndPre = new InOrderSuccAndPre(new Integer[]{1, 4, 2});
        assertEquals(Optional.of(4), inOrderSuccAndPre.successor(3));
    }

    @Test
    public void testSuccessorSameNumbers() {
        InOrderSuccAndPre inOrderSuccAndPre = new InOrderSuccAndPre(new Integer[]{5, 5, 5, 8, 5, 5, 5});
        assertEquals(Optional.of(8), inOrderSuccAndPre.successor(5));
    }

    @Test
    public void testSuccessorEmptyList() {
        InOrderSuccAndPre inOrderSuccAndPre = new InOrderSuccAndPre(new Integer[]{});
        assertEquals(Optional.empty(), inOrderSuccAndPre.successor(5));
    }

    @Test
    public void testSuccessorHighestNumber() {
        InOrderSuccAndPre inOrderSuccAndPre = new InOrderSuccAndPre(new Integer[]{5, 8, 2, 1, 9, 3});
        assertEquals(Optional.empty(), inOrderSuccAndPre.successor(9));
    }

    @Test
    public void testSuccessorHighestNumberNonExistant() {
        InOrderSuccAndPre inOrderSuccAndPre = new InOrderSuccAndPre(new Integer[]{5, 8, 2, 1, 9, 3});
        assertEquals(Optional.empty(), inOrderSuccAndPre.successor(10));
    }


    @Test
    public void testPredecessor1234() {
        InOrderSuccAndPre inOrderSuccAndPre = new InOrderSuccAndPre(new Integer[]{4, 2, 3, 1});
        assertEquals(Optional.of(2), inOrderSuccAndPre.predecessor(3));
    }

    @Test
    public void testPredecessor124() {
        InOrderSuccAndPre inOrderSuccAndPre = new InOrderSuccAndPre(new Integer[]{1, 4, 2});
        assertEquals(Optional.of(2), inOrderSuccAndPre.predecessor(3));
    }

    @Test
    public void testPredecessorSameNumbers() {
        InOrderSuccAndPre inOrderSuccAndPre = new InOrderSuccAndPre(new Integer[]{5, 5, 5, 1, 5, 5, 5});
        assertEquals(Optional.of(1), inOrderSuccAndPre.predecessor(5));
    }

    @Test
    public void testPredecessorEmptyList() {
        InOrderSuccAndPre inOrderSuccAndPre = new InOrderSuccAndPre(new Integer[]{});
        assertEquals(Optional.empty(), inOrderSuccAndPre.predecessor(5));
    }

    @Test
    public void testPredecessorLowestNumber() {
        InOrderSuccAndPre inOrderSuccAndPre = new InOrderSuccAndPre(new Integer[]{5, 8, 2, 1, 9, 3});
        assertEquals(Optional.empty(), inOrderSuccAndPre.predecessor(1));
    }

    @Test
    public void testPredecessorLowestNumberNonExistant() {
        InOrderSuccAndPre inOrderSuccAndPre = new InOrderSuccAndPre(new Integer[]{5, 8, 2, 1, 9, 3});
        assertEquals(Optional.empty(), inOrderSuccAndPre.predecessor(0));
    }
}
