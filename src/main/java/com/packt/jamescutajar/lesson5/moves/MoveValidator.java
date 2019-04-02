package com.packt.jamescutajar.lesson5.moves;

/**
 * Top level interface for lesson 5.
 * Implement this class as explained in the reading material.
 * In addition implement the moveTo method
 */
public interface MoveValidator {
    boolean validate(String start, String end);
}
