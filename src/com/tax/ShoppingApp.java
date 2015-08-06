package com.tax;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingApp {

    private final ComputeTax computeTax;
    private final TaxRate taxRate;
    ArrayList<String[]> items = new ArrayList<String[]>();

    public ShoppingApp(ComputeTax computeTax, TaxRate taxRate) {
        this.computeTax = computeTax;
        this.taxRate = taxRate;
    }

    public void start() {
        Scanner input = new Scanner(System.in);
        String item;
        do {
            System.out.print("Enter an item or quit: ");
            item = input.nextLine();
            tokenize(item);
        } while (!item.equals("quit"));
    }

    private void tokenize(String item) {
        String[] tokensOfItem = item.split(" ");
        items.add(tokensOfItem);
    }


}
