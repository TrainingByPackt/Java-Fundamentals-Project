package com.packt.jamescutajar.lesson5;

import com.packt.jamescutajar.lesson5.moves.MoveValidator;

import java.util.List;

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
