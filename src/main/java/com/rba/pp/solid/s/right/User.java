package com.rba.pp.solid.s.right;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class User implements IUser {

    // Give responsibility for sending email to a specific class
    private final IEmail email;

    @Override
    public User insert() {
        // implementation...
        email.send();
        return null;
    }

    @Override
    public User update(User user) {
        // implementation...
        return user;
    }

    @Override
    public void delete(int id) {
        // implementation...
    }

}
