package com.tax;

import org.junit.Test;

import static org.junit.Assert.*;


public class ComputeTaxTest {

    @Test
    public void shouldKnowsHowToComputeTaxWhenTaxRateIsZero() {
        ComputeTax computeTax = new ComputeTax();

        assertEquals(0, computeTax.computeTax(100, 0), 0.00);
    }
}