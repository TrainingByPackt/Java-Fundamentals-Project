package com.packt.jamescutajar.lesson5;

import com.packt.jamescutajar.lesson5.moves.CrossMove;
import com.packt.jamescutajar.lesson5.moves.MoveValidator;

import java.util.Arrays;
import java.util.List;

public class Rook extends ChessPiece {
    public Rook(String startPosition) {
        super(startPosition);
    }

    @Override
    public List<MoveValidator> getValidMoves() {
        return Arrays.asList(new CrossMove());
    }
}
