package com.rba.pp.solid.d;

public interface MessageSender {
    void sendMessage();
}

class EmailSender implements MessageSender{
    @Override
    public void sendMessage() {
        System.out.println("Sending an Email");
    }
}

class SmsSender implements MessageSender{
    @Override
    public void sendMessage() {
        System.out.println("Sending an Sms");
    }
}

