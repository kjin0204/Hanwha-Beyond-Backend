package com.ohgiraffers.section04.interfacegregation.resolved;

public class BasicPrinter implements PrinteOnly{
    @Override
    public void print() {
        System.out.println("깔끔하게 출력합니다.");
    }
}
