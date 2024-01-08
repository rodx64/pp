package com.rba.pp.solid.s;

import lombok.AllArgsConstructor;

public class User implements IUser {

    // Give responsibility for sending email to a specific class
    private IEmail email;

    public User(IEmail email){
        this.email = email;
    }

    @Override
    public User insert() {
        // implementation...
        email.send();
        return null;
    }

}

@AllArgsConstructor
class Email implements IEmail{

    private String from;
    private String to;
    private String message;

    @Override
    public void send() {
        System.out.println("Email enviado com sucesso!");
    }
}

interface IEmail {
    void send();
}

interface IUser {
    User insert();
}



