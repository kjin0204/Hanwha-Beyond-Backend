package com.ohgiraffers.section05.dependencyinversion.problem;

public class BadBadSmsSender {
    public void sendSms(String message) {
        System.out.println("문자 발송: " + message);
    }
}
