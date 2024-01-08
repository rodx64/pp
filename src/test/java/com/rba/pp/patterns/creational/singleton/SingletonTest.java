package com.rba.pp.patterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {
    @Test
    void getInstance() {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        assertInstanceOf(Singleton.class,singleton);
        assertInstanceOf(Singleton.class,singleton2);

        assertEquals(System.identityHashCode(singleton), System.identityHashCode(singleton2));
    }
}
