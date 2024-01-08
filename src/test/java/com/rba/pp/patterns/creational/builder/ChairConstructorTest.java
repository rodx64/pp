package com.rba.pp.patterns.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ChairConstructorTest {

    @Test
    void construct() {
        Chair chair = new Chair();
        ChairBuilder chairBuilder = new ChairBuilderImpl(chair);
        ChairConstructor chairConstructor = new ChairConstructor(chairBuilder);
        chair = chairConstructor.build();

        assertEquals("Building legs", chair.getLegs());
        assertEquals("Building seat", chair.getSeat());
        assertEquals("Building back", chair.getBack());
    }

}
