package com.rba.pp.solid.o.right;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeTest {

    @Test
    void validatingSquareArea() {
        GeometricShape square = new Square(new BigDecimal("1.2"), new BigDecimal("1.3"));
        BigDecimal area = square.calculateArea();
        assertEquals(new BigDecimal("1.56"), area);
    }

    @Test
    void validatingCircleArea() {
        GeometricShape circle = new Circle(new BigDecimal("1.2"));
        BigDecimal area = circle.calculateArea();
        assertEquals(new BigDecimal("4.52"), area);
    }
}