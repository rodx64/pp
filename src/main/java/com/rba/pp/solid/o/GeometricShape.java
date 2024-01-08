package com.rba.pp.solid.o;

import java.math.BigDecimal;
import java.math.RoundingMode;

public interface GeometricShape  {
    BigDecimal calculateArea();
}


class Square implements GeometricShape {
    private BigDecimal width;
    private BigDecimal height;

    public Square(BigDecimal width, BigDecimal height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public BigDecimal calculateArea() {
        return width.multiply(height);
    }
}


class Circle implements GeometricShape {
    private BigDecimal radius;

    public Circle(BigDecimal radius) {
        this.radius = radius;
    }

    @Override
    public BigDecimal calculateArea() {
        return radius.multiply(radius).multiply(new BigDecimal(Math.PI)).setScale(2, RoundingMode.HALF_EVEN);
    }
}