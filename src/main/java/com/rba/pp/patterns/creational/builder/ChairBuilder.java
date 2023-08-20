package com.rba.pp.patterns.creational.builder;

public interface ChairBuilder {
    Chair getChair();
    void buildLegs();
    void buildSeat();
    void buildBack();
}
