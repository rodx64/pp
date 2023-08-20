package com.rba.pp.patterns.creational.factory.concrete_products;

import com.rba.pp.patterns.creational.factory.abstractions.VehicleFactory;

public class CarConcrete implements VehicleFactory {

    @Override
    public void run() {
        System.out.println("Car running...");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped...");
    }
}
