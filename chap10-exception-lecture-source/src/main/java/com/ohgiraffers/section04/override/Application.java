package com.ohgiraffers.section04.override;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {

        SupperClass s = new SubClass();
        try {
            s.method();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
