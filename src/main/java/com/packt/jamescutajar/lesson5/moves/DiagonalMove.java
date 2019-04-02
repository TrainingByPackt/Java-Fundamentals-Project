package com.packt.jamescutajar.lesson5.moves;

public class DiagonalMove implements MoveValidator {
    @Override
    public boolean validate(String start, String end) {
        String horizonalTable = " abcdefgh";
        int xStart = horizonalTable.indexOf(start.charAt(0));
        int xEnd = horizonalTable.indexOf(end.charAt(0));
        int yStart = start.charAt(1);
        int yEnd = end.charAt(1);

        return Math.abs(yStart - yEnd) == Math.abs(xStart - xEnd)
                && !start.equals(end);
    }
}

