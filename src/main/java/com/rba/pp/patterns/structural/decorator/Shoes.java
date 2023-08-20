package com.rba.pp.patterns.structural.decorator;

import java.math.BigDecimal;

public class Shoes implements Product{

    String name = "Shoes";
    BigDecimal price = new BigDecimal("150.00");

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
