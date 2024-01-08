package com.rba.pp.solid.i;

public interface Bird {
    void sing();
}

interface Fly {
    void fly();
}

class Crown implements Bird, Fly{
    @Override
    public void sing() {
        System.out.println("Crown can sing");
    }

    @Override
    public void fly() {
        System.out.println("Crown can fly too");
    }
}
class Penguim implements Bird{
    @Override
    public void sing() {
        System.out.println("Penguim can sing");
    }
}