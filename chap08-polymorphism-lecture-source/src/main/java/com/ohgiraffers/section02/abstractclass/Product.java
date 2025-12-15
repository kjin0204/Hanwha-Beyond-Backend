package com.ohgiraffers.section02.abstractclass;

public abstract class Product {

    /* 설명. 자식 타입의 객체를 위해서는 쓰이는 생성자. */
    public Product() {
    }

    private static int staticField;
    private int nonStaticField;

    public static void staticMethod(){}
    public void nonStaticMethod(){}

    /* 설명. 불완전 메소드로 자식 객체에서 오버라이드(재정의)가 강제 됨 */
    public abstract void abstractMethod();
}
