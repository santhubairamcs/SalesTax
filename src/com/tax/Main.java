package com.tax;

public class Main {

    public static void main(String[] args) {
        ComputeTax computeTax = new ComputeTax();
        TaxRate taxRate = new TaxRate(10, 5);
        ShoppingApp shoppingApp = new ShoppingApp(computeTax, taxRate);
        shoppingApp.start();
    }
}
