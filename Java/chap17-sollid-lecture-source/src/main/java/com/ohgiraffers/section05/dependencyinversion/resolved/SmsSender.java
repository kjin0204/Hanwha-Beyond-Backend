package com.ohgiraffers.section05.dependencyinversion.resolved;

public class SmsSender implements MessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS 발송: " + message);
    }
}
