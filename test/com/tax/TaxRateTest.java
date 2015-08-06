package com.tax;

import org.junit.Test;

import static org.junit.Assert.*;


public class TaxRateTest {

    @Test
    public void shouldKnowsHowToFixTaxRateForExemptibleGoodsAndNoImportedDuty() {
        TaxRate taxRate = new TaxRate(10, 5);

        assertEquals(0, taxRate.getTotalTaxRate(true, false),0.00);
    }
}