package com.rba.pp.patterns.creational.builder;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ChairBuilderImpl implements ChairBuilder{

    private final Chair chair;

    @Override
    public void buildLegs() {
        chair.setLegs("Building legs");
    }

    @Override
    public void buildSeat() {
        chair.setSeat("Building seat");
    }

    @Override
    public void buildBack() {
        chair.setBack("Building back");
    }

    @Override
    public Chair getChair() {
        return chair;
    }
}
