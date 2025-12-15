package com.ohgiraffers.section06.time;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. time 패키지에서 제공하는 클래스등의 사용 방법을 이해할 수 있다. */
        LocalTime timeNow = LocalTime.now();
        LocalTime timeNow2 = LocalTime.of(14,33,20);
        System.out.println("timeNow = " + timeNow);
        System.out.println("timeNow2 = " + timeNow2);

        LocalDate dateNow = LocalDate.now();
        LocalDate dateOf = LocalDate.of(2025,8,13);
        System.out.println("dateNow = " + dateNow);
        System.out.println("dateOf = " + dateOf);

        LocalDateTime dateTimeNow = LocalDateTime.now();
        LocalDateTime dateTimeOf = LocalDateTime.of(2025,8,13,14,33,20);
        System.out.println("dateTimeNow = " + dateTimeNow);
        System.out.println("dateTimeOf = " + dateTimeOf);

        /* 필기. 타임존 적용 */
        ZonedDateTime zoneddDateTimeNow = ZonedDateTime.now();
        ZonedDateTime zoneddDateTimeOf = ZonedDateTime.of(dateOf,timeNow2, ZoneId.of("Asia/Seoul"));
        System.out.println("zoneddDateTimeNow = " + zoneddDateTimeNow);
        System.out.println("zoneddDateTimeOf = " + zoneddDateTimeOf);



        LocalDate start = LocalDate.of(2025, 8, 1);
        LocalDate end   = LocalDate.of(2025, 8, 19);

        // 일 단위 차이
        long days = ChronoUnit.DAYS.between(start, end);
        System.out.println(days); // 18

        // 년/월/일 단위로 차이
        Period period = Period.between(start, end);
        System.out.println(period.getYears());  // 0
        System.out.println(period.getMonths()); // 0
        System.out.println(period.getDays());   // 18

        LocalTime t1 = LocalTime.of(10, 0);
        LocalTime t2 = LocalTime.of(12, 30);

        Duration diff = Duration.between(t1, t2);
        System.out.println(diff.toHours());   // 2
        System.out.println(diff.toMinutes()); // 150

    }
}
