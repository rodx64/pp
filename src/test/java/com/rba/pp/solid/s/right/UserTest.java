package com.rba.pp.solid.s.right;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void insert() {
        IEmail email = new Email("", "", "");
        User user = new User(email);
        assertNotNull(user);
    }
}