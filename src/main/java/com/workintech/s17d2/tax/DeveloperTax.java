package com.workintech.s17d2.tax;

import org.springframework.stereotype.Component;

@Component //  DeveloperTax must be component after that you can call it with Dependency Injection
public class DeveloperTax implements Taxable{
    @Override
    public double getSimpleTaxRate() {
        return 15d;
    }

    @Override
    public double getMiddleTaxRate() {
      return 25d;
    }

    @Override
    public double getUpperTaxRate() {
        return 35d;
    }
}
