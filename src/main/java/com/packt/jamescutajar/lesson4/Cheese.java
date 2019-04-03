package com.packt.jamescutajar.lesson4;

/**
 * Exercise for Lesson 4
 * Complete this class with the fields needed and the accompanying getters methods
 * In addition implement the sub classes as explained in the reading material
 */
public class Cheese {
    private final String name;
    private final double price;
    private final double taxRate;
    private final int quantityBought;

    public Cheese(String name, double price,
                  double taxRate, int quantityBought) {
        this.name = name;
        this.price = price;
        this.taxRate = taxRate;
        this.quantityBought = quantityBought;
    }

    public String getName() {
        return name;
    }

    public int getQuantityBought() {
        return quantityBought;
    }

    public double getPrice() {
        return price;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double calculateTotalPrice() {
        double base = getPrice() * quantityBought;
        return base * getTaxRate() + base;
    }
}
