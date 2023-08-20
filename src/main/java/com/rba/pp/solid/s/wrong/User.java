package com.rba.pp.solid.s.wrong;

public class User implements IUser {

    @Override
    public User insert() {
        // implementation...
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

    // Wrong, because the Manager shouldn't be responsible to send emails
    @Override
    public void sendEmailAfterCreation() {
        // implementation...
    }
}
