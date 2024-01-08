package com.rba.pp.patterns.structural.decorator;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void tshirtTest(){
        Product tshirt = new Tshirt();
        tshirt = new ExtraSizeDecorator(tshirt);
        tshirt = new ColorDecorator(tshirt);

        assertEquals(new BigDecimal("57.00").setScale(2, RoundingMode.CEILING), tshirt.getPrice());
        assertEquals("T-shirt, extra size, with color", tshirt.getName());
    }

    @Test
    void shoesTest(){
        Product shoes = new Shoes();
        shoes = new KidSizeDecorator(shoes);
        shoes = new ColorDecorator(shoes);

        assertEquals(new BigDecimal("153.00").setScale(2, RoundingMode.CEILING), shoes.getPrice());
        assertEquals("Shoes, kids size, with color", shoes.getName());
    }

}
