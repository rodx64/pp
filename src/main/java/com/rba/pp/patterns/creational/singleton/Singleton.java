package com.rba.pp.patterns.creational.singleton;

import lombok.Synchronized;

public class Singleton {
    private static final Singleton instance = new Singleton();

    @Synchronized
    public static Singleton getInstance(){
        return instance;
    }

}
