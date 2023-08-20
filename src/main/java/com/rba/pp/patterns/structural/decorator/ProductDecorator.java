package com.rba.pp.patterns.structural.decorator;

import java.math.BigDecimal;

public abstract class ProductDecorator implements Product {

    @Override
    public String getName() {
        return this.getName();
    }

    @Override
    public BigDecimal getPrice() {
        return this.getPrice();
    }

}
