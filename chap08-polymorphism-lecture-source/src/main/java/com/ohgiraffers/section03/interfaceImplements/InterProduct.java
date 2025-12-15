package com.ohgiraffers.section03.interfaceImplements;


public interface InterProduct extends ParentInterProduct, AnoterInterProduct{
    
    /* 설명. 상수 필드(feat. public static final) */
    public static final int MAX_NUM = 100;
    int MIN_NUM = 1;    // public static final 안적어도 컴파일러가 붙임.
    
    /* 설명. 인터페이스는 생성자를 가지지 않는다 */
    
    /* 설명. 추상 메소드 (feat public abstract) */
    public abstract void nonStaticMethod(int num);
    void nonStaticMethod2();    // public abstract 생략 해도 컴파일러가 붙임.

    /* 설명. JDK 1.8부터 추가된 body가 있는 메소드들 */
    public static void staticMethod(){
        
    }
    
    /* 설명. non-static 메소드 */
    public default void defaultMethod(){
        
    }
    
    /* 설명. private 접근 제어자 메소드 */
    private void privateMethod(){
        
    }
}
