package com.ohgiraffers.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SupperClass {

    /* 설명. 부모 클래스의 메소드와 동일한 레벨의 예외 throws 시 문제 없음 */
//    @Override
//    public void method() throws IOException {}

/* 설명. 부모 클래스의 메소드와 달리 예외를 발생 시키지 않아도 됨 */
//    @Override
//    public void method() {}

    /* 설명. 부모 클래스의 메소드에서 발상한 예외보다 자식 타입은 가능 */
    @Override
    public void method()  throws FileNotFoundException {}

    /* 설명. 부모 클래스의 메소드 예외 */
//    @Override
//    public void method()  throws Exception{}
}
