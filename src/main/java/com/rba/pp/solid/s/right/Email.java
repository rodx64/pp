package com.rba.pp.solid.s.right;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Email implements IEmail{

    private String from;
    private String to;
    private String message;

    @Override
    public void send() {
        // rules...
    }
}
