package com.rba.pp.patterns.creational.factory;

import com.rba.pp.patterns.creational.factory.abstractions.VehicleCreator;
import com.rba.pp.patterns.creational.factory.abstractions.VehicleFactory;
import com.rba.pp.patterns.creational.factory.concrete_products.CarConcrete;
import com.rba.pp.patterns.creational.factory.concrete_products.MotorcycleConcrete;

public class VehicleCreatorConcrete implements VehicleCreator {

    @Override
    public VehicleFactory factory(VehicleType vehicle) {
        if(vehicle.name().equals(VehicleType.CAR.name()))
            return new CarConcrete();
        else if(vehicle.name().equals(VehicleType.MOTORCYCLE.name()))
            return new MotorcycleConcrete();
        else return null;
    }
}
