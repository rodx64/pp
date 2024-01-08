package com.rba.pp.tell_dont_ask;

public interface Vehicle {
    void startEngine();
}

class Car implements Vehicle{
    private boolean engineStarted;

    @Override
    public void startEngine() {
        if (!engineStarted) {
            System.out.println("Starting the engine...");
            engineStarted = true;
        } else {
            System.out.println("The engine is already running.");
        }
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }
}