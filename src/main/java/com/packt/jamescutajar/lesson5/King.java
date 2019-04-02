package com.packt.jamescutajar.lesson5;

import com.packt.jamescutajar.lesson5.moves.MoveValidator;
import com.packt.jamescutajar.lesson5.moves.SingleMove;

import java.util.Arrays;
import java.util.List;

public class King extends ChessPiece {
    public King(String startPosition) {
        super(startPosition);
    }

    @Override
    public List<MoveValidator> getValidMoves() {
        return Arrays.asList(new SingleMove());
    }
}
