package com.rba.pp.solid.o;

import java.math.BigDecimal;

public class ApplicationMain {
    public static void main(String[] args) {
        GeometricShape square = new Square(new BigDecimal("1.2"), new BigDecimal("1.3"));
        System.out.println(square.calculateArea());

        GeometricShape circle = new Circle(new BigDecimal("1.2"));
        System.out.println(circle.calculateArea());
    }

}
