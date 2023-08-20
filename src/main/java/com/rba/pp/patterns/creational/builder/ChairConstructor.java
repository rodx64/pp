package com.rba.pp.patterns.creational.builder;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ChairConstructor {

    private final ChairBuilder chairBuilder;

    public Chair build(){
        // Follow dependence order (if necessary)
        this.chairBuilder.buildLegs();
        this.chairBuilder.buildSeat();
        this.chairBuilder.buildBack();
        return this.chairBuilder.getChair();
    }

}
