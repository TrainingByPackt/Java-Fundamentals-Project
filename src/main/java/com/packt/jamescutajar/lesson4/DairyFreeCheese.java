package com.packt.jamescutajar.lesson4;

public class DairyFreeCheese extends Cheese {
    public DairyFreeCheese(String name, double price,
                           double taxRate, int quantityBought) {
        super(name, price, taxRate, quantityBought);
    }

    @Override
    public double getTaxRate() {
        return Math.max(super.getTaxRate() - 0.1, 0.01);
    }
}
