package com.rba.pp.patterns.structural.decorator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class KidSizeDecorator extends ProductDecorator {

    final Product product;
    public KidSizeDecorator(Product product){
        this.product=product;
    }
  
    public  String getName(){
        return product.getName() + ", kids size";
    }
    public BigDecimal getPrice(){
        return product.getPrice().add(new BigDecimal("1.00")).setScale(2, RoundingMode.CEILING);
    }

}
