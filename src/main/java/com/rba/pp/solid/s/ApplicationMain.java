package com.rba.pp.solid.s;


public class ApplicationMain {
    public static void main(String[] args) {
        IEmail email = new Email("me", "you", "bla bla");
        User user = new User(email);
        user.insert();
    }

}
