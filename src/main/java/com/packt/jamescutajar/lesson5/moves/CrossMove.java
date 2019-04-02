package com.packt.jamescutajar.lesson5.moves;

public class CrossMove implements MoveValidator {
    @Override
    public boolean validate(String start, String end) {
        boolean horizonalMove = start.charAt(0) != end.charAt(0)
                && start.charAt(1) == end.charAt(1);

        boolean verticalMove = start.charAt(0) == end.charAt(0)
                && start.charAt(1) != end.charAt(1);

        return horizonalMove || verticalMove;
    }
}
