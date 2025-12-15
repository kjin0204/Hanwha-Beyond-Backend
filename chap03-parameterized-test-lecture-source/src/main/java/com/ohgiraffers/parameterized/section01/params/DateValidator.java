package com.ohgiraffers.parameterized.section01.params;

import java.time.Month;

public class DateValidator {
    public static boolean isCollect(Month month) {
//        int monthValue = month.ordinal(); // ordinal은 enum 타입의 선언 순서별 인덱스 번호(0으로 시작)
        int monthValue = month.getValue(); // getValue는 월별 숫자로 표현


        return monthValue >= 1 && monthValue <= 12;
    }

    public static int getLstDayOf(Month month) {
        return month.maxLength(); //Month enum 타입의 메소드 활용(달의 마지막 날반환)
    }
}
