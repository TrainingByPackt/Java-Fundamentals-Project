package com.packt.jamescutajar.lesson4;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CheeseTillTest {

    @Test
    public void testTillEmtpy() {
        CheeseTill till = new CheeseTill();
        assertEquals(0.0, till.calculateBill(new Cheese[0]));
    }

    @Test
    public void testNormalCheese() {
        CheeseTill till = new CheeseTill();
        Cheese cheese1 = new Cheese("bluecheese", 2.0, 0.1, 10);
        Cheese cheese2 = new Cheese("bluecheese", 4.0, 0.2, 20);
        assertEquals(118.0, till.calculateBill(new Cheese[]{cheese1, cheese2}));
    }

    @Test
    public void testImportedCheese() {
        CheeseTill till = new CheeseTill();
        Cheese cheese1 = null;
        try {
            cheese1 = (Cheese)Class.forName("com.packt.jamescutajar.lesson4.ImportedCheese")
                    .getDeclaredConstructor(String.class, double.class, double.class, int.class)
                    .newInstance("mozzarella", 2.0, 0.1, 10);
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException
                | InvocationTargetException | ClassCastException e) {
            fail("For this test to work you need to declare a class with the exact name and package 'com.packt.jamescutajar.lesson4.ImportedCheese'. " +
                    "It also needs a constructor accepting the initial a string name, a double price, a double tax rate and a int quantity. In order.");
        }

        assertEquals(24.0, till.calculateBill(new Cheese[]{cheese1}));
    }

    @Test
    public void testDairyFreeCheese1() {
        CheeseTill till = new CheeseTill();
        Cheese cheese1 = null;
        try {
            cheese1 = (Cheese)Class.forName("com.packt.jamescutajar.lesson4.DairyFreeCheese")
                    .getDeclaredConstructor(String.class, double.class, double.class, int.class)
                    .newInstance("parmesan", 2.0, 0.05, 10);
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException
                | InvocationTargetException | ClassCastException e) {
            fail("For this test to work you need to declare a class with the exact name and package 'com.packt.jamescutajar.lesson4.DairyFreeCheese'. " +
                    "It also needs a constructor accepting the initial a string name, a double price, a double tax rate and a int quantity. In order.");
        }

        assertEquals(20.2, till.calculateBill(new Cheese[]{cheese1}));
    }

    @Test
    public void testDairyFreeCheese2() {
        CheeseTill till = new CheeseTill();
        Cheese cheese1 = null;
        try {
            cheese1 = (Cheese)Class.forName("com.packt.jamescutajar.lesson4.DairyFreeCheese")
                    .getDeclaredConstructor(String.class, double.class, double.class, int.class)
                    .newInstance("parmesan", 2.0, 0.15, 10);
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException
                | InvocationTargetException | ClassCastException e) {
            fail("For this test to work you need to declare a class with the exact name and package 'com.packt.jamescutajar.lesson4.DairyFreeCheese'. " +
                    "It also needs a constructor accepting the initial a string name, a double price, a double tax rate and a int quantity. In order.");
        }

        assertEquals(21.0, till.calculateBill(new Cheese[]{cheese1}));
    }



}
