package com.rba.pp.solid.d;

public class ApplicationMain {
    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        SmsSender smsSender = new SmsSender();
        sendAnEmail(emailSender);
        sendAnEmail(smsSender);
    }

    static void sendAnEmail(MessageSender messageSender){
        messageSender.sendMessage();
    };
}
