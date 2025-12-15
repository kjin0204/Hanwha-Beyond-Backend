package com.ohgiraffers.section03.interfaceImplements;

public class Application {
    public static void main(String[] args) {
        Product p = new Product();
        p.nonStaticMethod(1);

        InterProduct inter = new Product();
        inter.nonStaticMethod(2);
    }
}
