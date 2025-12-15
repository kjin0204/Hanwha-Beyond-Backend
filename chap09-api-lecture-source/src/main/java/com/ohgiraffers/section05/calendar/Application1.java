package com.ohgiraffers.section05.calendar;

import java.text.SimpleDateFormat;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. java.util.Date 클래스 사용법을 이해할 수 있다. */
        java.util.Date today = new java.util.Date();
        System.out.println("today = " + today); // Wed Aug 13 11:14:43 KST 2025

        /* 필기. 1970년 1월 1일 0시(그리니치 천문대) */
        System.out.println("long 타입 시간: " + today.getTime()); // 1755051283921 <- 1970년 1월 1일 0시 부터 흐른 시간 ms 단위
        System.out.println("long 타입 시간을 활용한 Date: " + new java.util.Date(0L)); // Thu Jan 01 09:00:00 KST 1970
        System.out.println("long 타입 시간을 활용한 Date: " + new java.util.Date(today.getTime()));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E요일"); // 2025-08-13 11:15:53 수요일
        String todayFormat = sdf.format(today);
        System.out.println("todayFormat = " + todayFormat);

        /* 설명. java.util.Date <-> java.sql.Date */
        java.util.Date today2 = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(today2.getTime());

        java.util.Date date = sqlDate; // 다형성 적용

    }
}
