package com.ohgiraffers.section06.StaticKeyword;

public class StaticTest {

    private int nonStaticCount;
    private static int staticCount;

    public StaticTest() {
    }

    public static int getStaticCount() {
        return staticCount;
    }

    public static void increseStaticCount() {
        staticCount++;
    }


    public int getNonStaticCOunt() {
        return nonStaticCount;
    }

    public void increaseNonStaticCount() {
        nonStaticCount++;
    }
}
