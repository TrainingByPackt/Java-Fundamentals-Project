package com.packt.jamescutajar.lesson5.moves;

public class SingleMove implements MoveValidator {
    @Override
    public boolean validate(String start, String end) {
        String horizonalTable = " abcdefgh";
        int xStart = horizonalTable.indexOf(start.charAt(0));
        int xEnd = horizonalTable.indexOf(end.charAt(0));
        int yStart = Integer.parseInt(start.charAt(1) + "");
        int yEnd = Integer.parseInt(end.charAt(1) + "");

        return Math.abs(yStart - yEnd) <= 1 && Math.abs(xStart - xEnd) <= 1
                && !start.equals(end);
    }
}
