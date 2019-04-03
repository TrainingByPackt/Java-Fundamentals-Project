package com.packt.jamescutajar.lesson4;

public class ImportedCheese extends Cheese {
    public ImportedCheese(String name, double price,
                          double taxRate, int quantityBought) {
        super(name, price, taxRate, quantityBought);
    }

    @Override
    public double getTaxRate() {
        return super.getTaxRate() + 0.1;
    }
}
