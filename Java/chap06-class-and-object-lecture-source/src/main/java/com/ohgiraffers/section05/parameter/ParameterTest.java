package com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class ParameterTest {

    public void testPrimitiveTypeParameter(int num) {
        num = 10;
        System.out.println("메소드 안 num = " + num);


    }

    public void testPrimitiveArrayTypeParameter(int[] iArr) {
        iArr[0] = 10;
        System.out.println("메소드 안 iArr = " + Arrays.toString(iArr));

    }

    public void testClassTypeParameter(Rectangle rect){
        rect.calArea();
        rect.calRound();
        System.out.println(rect);
    }


    public void testVariableLengthArrayParameter(String... str) {
        System.out.println("넘어온 인자 출력: " + Arrays.toString(str));
    }
}
