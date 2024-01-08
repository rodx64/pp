package com.rba.pp.patterns.structural.decorator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExtraSizeDecorator extends ProductDecorator {

    final Product product;
    public ExtraSizeDecorator(Product product){
        this.product=product;
    }
    public  String getName(){
        return product.getName() + ", extra size";
    }
    public BigDecimal getPrice(){
        return product.getPrice().add(new BigDecimal("5.00").setScale(2, RoundingMode.CEILING));
    }

}
