package com.ohgiraffers.section06.singleton;

public class EagerSingleton {

    public static EagerSingleton eager = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance()
    {
        return eager;
    }

}
