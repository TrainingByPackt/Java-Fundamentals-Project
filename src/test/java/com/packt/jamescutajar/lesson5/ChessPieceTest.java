package com.packt.jamescutajar.lesson5;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

public class ChessPieceTest {

    @Test
    public void testBishop() {
        ChessPiece piece = null;
        try {
            piece = (ChessPiece)Class.forName("com.packt.jamescutajar.lesson5.Bishop").getDeclaredConstructor(String.class).newInstance("d4");
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException
                | InvocationTargetException | ClassCastException e) {
            fail("For this test to work you need to declare a class with the exact name and package 'com.packt.jamescutajar.lesson5.Bishop'. " +
                    "It also needs a constructor accepting the initial chess position of type String");
        }
        assertTrue(piece.moveTo("c3"), "Validation is not working. Bishop should be able to move from d4 to c3");
        assertEquals("c3", piece.getCurrentPosition());

        assertTrue(piece.moveTo("a5"), "Validation is not working. Bishop should be able to move from c3 to a5");
        assertEquals("a5", piece.getCurrentPosition());

        assertFalse(piece.moveTo("a1"), "Validation is not working. Bishop should not be able to move from a5 to a5");
        assertEquals("a5", piece.getCurrentPosition());

        assertFalse(piece.moveTo("c4"), "Validation is not working. Bishop should not be able to move from a5 to c4");
        assertEquals("a5", piece.getCurrentPosition());

        assertFalse(piece.moveTo("a5"), "Validation is not working. Bishop should not be able to move from a5 to a5");
        assertEquals("a5", piece.getCurrentPosition());
    }

    @Test
    public void testRook() {
        ChessPiece piece = null;
        try {
            piece = (ChessPiece)Class.forName("com.packt.jamescutajar.lesson5.Rook").getDeclaredConstructor(String.class).newInstance("d4");
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException
                | InvocationTargetException | ClassCastException e) {
            fail("For this test to work you need to declare a class with the exact name and package 'com.packt.jamescutajar.lesson5.Rook'. " +
                    "It also needs a constructor accepting the initial chess position of type String");
        }
        assertTrue(piece.moveTo("d8"), "Validation is not working. Rook should be able to move from d4 to d8");
        assertEquals("d8", piece.getCurrentPosition());

        assertTrue(piece.moveTo("h8"), "Validation is not working. Rook should be able to move from d4 to h8");
        assertEquals("h8", piece.getCurrentPosition());

        assertFalse(piece.moveTo("a1"), "Validation is not working. Rook should not be able to move from h8 to a1");
        assertEquals("h8", piece.getCurrentPosition());

        assertFalse(piece.moveTo("h8"), "Validation is not working. Rook should not be able to move from h8 to h8");
        assertEquals("h8", piece.getCurrentPosition());
    }


    @Test
    public void testKing() {
        ChessPiece piece = null;
        try {
            piece = (ChessPiece)Class.forName("com.packt.jamescutajar.lesson5.King").getDeclaredConstructor(String.class).newInstance("d4");
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException
                | InvocationTargetException | ClassCastException e) {
            fail("For this test to work you need to declare a class with the exact name and package 'com.packt.jamescutajar.lesson5.King'. " +
                    "It also needs a constructor accepting the initial chess position of type String");
        }
        assertTrue(piece.moveTo("c3"), "Validation is not working. King should be able to move from d4 to c3");
        assertEquals("c3", piece.getCurrentPosition());

        assertTrue(piece.moveTo("c4"), "Validation is not working. King should be able to move from c3 to c4");
        assertEquals("c4", piece.getCurrentPosition());

        assertTrue(piece.moveTo("d4"), "Validation is not working. King should be able to move from c4 to d5");
        assertEquals("d4", piece.getCurrentPosition());

        assertFalse(piece.moveTo("f4"), "Validation is not working. King should not be able to move from d4 to f4");
        assertEquals("d4", piece.getCurrentPosition());

        assertFalse(piece.moveTo("d4"), "Validation is not working. King should not be able to move from d4 to d4");
        assertEquals("d4", piece.getCurrentPosition());
    }

    @Test
    public void testQueen() {
        ChessPiece piece = null;
        try {
            piece = (ChessPiece)Class.forName("com.packt.jamescutajar.lesson5.Queen").getDeclaredConstructor(String.class).newInstance("d4");
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException
                | InvocationTargetException | ClassCastException e) {
            fail("For this test to work you need to declare a class with the exact name and package 'com.packt.jamescutajar.lesson5.Queen'. " +
                    "It also needs a constructor accepting the initial chess position of type String");
        }
        assertTrue(piece.moveTo("b2"), "Validation is not working. Queen should be able to move from d4 to b2");
        assertEquals("b2", piece.getCurrentPosition());

        assertTrue(piece.moveTo("b7"), "Validation is not working. Queen should be able to move from b2 to b7");
        assertEquals("b7", piece.getCurrentPosition());

        assertTrue(piece.moveTo("f3"), "Validation is not working. Queen should be able to move from b7 to f3");
        assertEquals("f3", piece.getCurrentPosition());

        assertFalse(piece.moveTo("e6"), "Validation is not working. Queen should not be able to move from f3 to e6");
        assertEquals("f3", piece.getCurrentPosition());

        assertFalse(piece.moveTo("f3"), "Validation is not working. Queen should not be able to move from f3 to f3");
        assertEquals("f3", piece.getCurrentPosition());
    }
}
