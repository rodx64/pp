package com.rba.pp.patterns.creational.factory;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum VehicleType {

    CAR(0, "car"),
    MOTORCYCLE(1, "motorcycle"),
    ;

    int id;
    String name;

}
