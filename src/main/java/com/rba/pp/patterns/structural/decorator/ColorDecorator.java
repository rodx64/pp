package com.rba.pp.patterns.structural.decorator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ColorDecorator extends ProductDecorator {

    final Product product;
    public ColorDecorator(Product product){
        this.product=product;
    }
    public  String getName(){
        return product.getName() + ", with color";
    }
    public BigDecimal getPrice(){
        return product.getPrice().add(new BigDecimal("2.00").setScale(2, RoundingMode.CEILING));
    }

}
