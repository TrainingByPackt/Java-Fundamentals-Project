package com.packt.jamescutajar.lesson5;

import com.packt.jamescutajar.lesson5.moves.DiagonalMove;
import com.packt.jamescutajar.lesson5.moves.MoveValidator;

import java.util.Arrays;
import java.util.List;

public class Bishop extends ChessPiece {
    public Bishop(String startPosition) {
        super(startPosition);
    }

    @Override
    public List<MoveValidator> getValidMoves() {
        return Arrays.asList(new DiagonalMove());
    }
}
