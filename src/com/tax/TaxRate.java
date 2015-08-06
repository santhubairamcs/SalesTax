package com.tax;

public class TaxRate {
    private final double basic;
    private final double importedDuty;

    public TaxRate(double basic, double importedDuty) {
        this.basic = basic;
        this.importedDuty = importedDuty;
    }

    public double getTotalTaxRate(boolean exemptible, boolean isImported) {
        if (isImported && exemptible)
            return importedDuty;
        return 0.0;
    }
}
