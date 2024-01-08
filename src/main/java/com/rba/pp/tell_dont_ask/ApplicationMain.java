package com.rba.pp.tell_dont_ask;

public class ApplicationMain {
    public static void main(String[] args) {
        Car car = new Car();

        // Telling what to do
        car.startEngine();

        // Not asking
        // if(!isEngineStarted){
        //     car.startEngine();
        // }
    }

}
