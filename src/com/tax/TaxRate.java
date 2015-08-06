package com.tax;

public class TaxRate {
    private final double basic;
    private final double importedDuty;

    public TaxRate(double basic, double importedDuty) {
        this.basic = basic;
        this.importedDuty = importedDuty;
    }

    public double getTotalTaxRate(boolean exemptible, boolean imported) {
        if (imported && exemptible)
            return importedDuty;
        else if (!exemptible && !imported)
            return basic;
        return 0.0;
    }
}
