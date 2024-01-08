package com.rba.pp.patterns.creational.factory;

import com.rba.pp.patterns.creational.factory.abstractions.VehicleFactory;
import com.rba.pp.patterns.creational.factory.abstractions.VehicleCreator;
import com.rba.pp.patterns.creational.factory.concrete_products.CarConcrete;
import com.rba.pp.patterns.creational.factory.concrete_products.MotorcycleConcrete;
import org.junit.jupiter.api.Test;

import static com.rba.pp.patterns.creational.factory.VehicleType.CAR;
import static com.rba.pp.patterns.creational.factory.VehicleType.MOTORCYCLE;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class VehicleCreatorConcreteTest {

    @Test
    void test(){
        VehicleCreator vehicleCreator = new VehicleCreatorConcrete();

        VehicleFactory bike1 = vehicleCreator.factory(MOTORCYCLE) ;
        bike1.run();
        bike1.stop();

        VehicleFactory car1 = vehicleCreator.factory(CAR);
        car1.run();
        car1.stop();

        assertInstanceOf(MotorcycleConcrete.class, bike1);
        assertInstanceOf(CarConcrete.class, car1);
    }

}
