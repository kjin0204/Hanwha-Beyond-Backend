package com.ohgiraffers.section06.singleton;

public class LazySinglton {
    private static LazySinglton _instance;

    private LazySinglton(){
    }

    public static LazySinglton get_instance() {
        if(_instance == null)
            _instance = new LazySinglton();

        return _instance;
    }
}
