package com.packt.jamescutajar.lesson4;

public class CheeseTill {

    /**
     * Exercise for Lesson 4
     * Implement this method as explained in the reading material after implementing
     * the different cheese classes
     */
    public double calculateBill(Cheese[] shoppingCart) {
        double total = 0.0;
        for (Cheese item : shoppingCart) {
            total += item.calculateTotalPrice();
        }
        return total;
    }

    public static void main(String[] args) {
        Cheese[] shoppingCart = new Cheese[]{
                new Cheese("cheddar", 2.20, 0.05, 3), //price = 6.93
                new ImportedCheese("brie", 3.70, 0.07, 2), //price = 8.658
                new DairyFreeCheese("soya", 3.70, 0.08, 2), //price = 7.474
        };

        System.out.println(new CheeseTill().calculateBill(shoppingCart));
    }
}
