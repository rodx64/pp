package com.rba.pp.patterns.creational.factory.concrete_products;

import com.rba.pp.patterns.creational.factory.abstractions.VehicleFactory;

public class MotorcycleConcrete implements VehicleFactory {
    @Override
    public void run() {
        System.out.println("Motorcycle running...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped..");
    }
}
