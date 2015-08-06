package com.tax;

import org.junit.Test;

import static org.junit.Assert.*;


public class TaxRateTest {

    @Test
    public void shouldKnowsHowToFixTaxRateForExemptibleGoodsAndNoImportedDuty() {
        TaxRate taxRate = new TaxRate(10, 5);

        assertEquals(0, taxRate.getTotalTaxRate(true, false),0.00);
    }

    @Test
    public void shouldKnowsHowToFixTaxRateForExemptibleGoodsAndImportedDuty() {
        TaxRate taxRate = new TaxRate(10, 5);

        assertEquals(5, taxRate.getTotalTaxRate(true, true),0.00);
    }
}