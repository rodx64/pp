package com.rba.pp.patterns.creational.factory.abstractions;

import com.rba.pp.patterns.creational.factory.VehicleType;

public interface VehicleCreator {
    VehicleFactory factory(VehicleType type);

}
