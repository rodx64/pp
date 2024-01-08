package com.rba.pp.patterns.structural.decorator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Tshirt implements Product{

    String name = "T-shirt";
    BigDecimal price = new BigDecimal("50.00").setScale(2, RoundingMode.CEILING);

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
