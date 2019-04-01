package com.packt.jamescutajar.lesson7;

import java.util.Arrays;
import java.util.Optional;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Exercise for Lesson 7.
 * Implement the methods and constructors in this class as explained in the readme file
 */
public class InOrderSuccAndPre {

    private SortedSet<Integer> sortedSet = new TreeSet<>();

    public InOrderSuccAndPre(Integer[] numbers) {
        sortedSet.addAll(Arrays.asList(numbers));
    }

    public Optional<Integer> successor(Integer x) {
        SortedSet<Integer> tailSet = sortedSet.tailSet(x + 1);
        if (tailSet.isEmpty())
            return Optional.empty();
        else
            return Optional.of(tailSet.first());
    }

    public Optional<Integer> predecessor(int x) {
        SortedSet<Integer> headSet = sortedSet.headSet(x);
        if (headSet.isEmpty())
            return Optional.empty();
        else
            return Optional.of(headSet.last());
    }
}
