package com.rba.pp.solid.o.right;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Builder
@Data
public class Circle implements GeometricShape {

    private BigDecimal radius;

    @Override
    public BigDecimal calculateArea() {
        return radius.multiply(radius).multiply(new BigDecimal(Math.PI)).setScale(2, RoundingMode.HALF_EVEN);
    }
}
