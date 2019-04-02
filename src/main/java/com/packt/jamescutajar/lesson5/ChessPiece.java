package com.packt.jamescutajar.lesson5;

import com.packt.jamescutajar.lesson5.moves.MoveValidator;

import java.util.List;

/**
 * Top level abstract class for lesson 5.
 * Extend this class as explained in the reading material.
 * In addition implement the moveTo method
 */
public abstract class ChessPiece {
    private String currentPosition;

    public ChessPiece(String startPosition) {
        this.currentPosition = startPosition;
    }

    public String getCurrentPosition() {
        return currentPosition;
    }

    public abstract List<MoveValidator> getValidMoves();

    public boolean moveTo(String position) {
        return false;
    }
}
