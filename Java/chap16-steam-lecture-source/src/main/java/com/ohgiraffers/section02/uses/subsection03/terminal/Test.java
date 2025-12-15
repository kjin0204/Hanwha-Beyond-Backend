package com.ohgiraffers.section02.uses.subsection03.terminal;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        List<Member> members = Arrays.asList(
                new Member("b", "b", 20, ""),
                new Member("a", "a", 10, ""),
                new Member("c", "c", 30, ""),
                new Member("c", "c", 20, ""),
                new Member("d", "d", 10, "")
        );

        System.out.println("========1. 이름 내림 차순, 2. 나이 오름차순 정렬==============");
        members.stream()
                .sorted(Comparator
                        .comparing(Member::getName, Comparator.reverseOrder()) // 1차 이름 내림차순 정렬
                        .thenComparingInt(Member::getAge) // 2차 이름이 같을 경우 나이 오름차순정렬
                )
                .forEach(System.out::println);

        System.out.println("========1. 나이 내림 차순, 2. 이름 내림 차순 정렬==============");
        members.stream()
                .sorted(Comparator
                        .comparingInt(Member::getAge).reversed() // 1차 나이 내림 차순 정렬
                        .thenComparing(Member::getName, Comparator.reverseOrder()) // 2차 나이가 같을 경우 name 내림 차순
                )

                .forEach(System.out::println);


        System.out.println(IntStream.rangeClosed(1, 10).count());
        OptionalDouble avg = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .mapToInt(Integer::intValue)
                .average();
        System.out.println(avg.orElse(0.0));

        OptionalInt max = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .mapToInt(Integer::valueOf)
                .max();
        System.out.println(max.orElse(0));

        OptionalInt min = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .min();
        System.out.println(min.orElse(0));
        System.out.println("===================================");
        OptionalInt result = IntStream.range(1, 6)
                .reduce((a, b) -> {
                    System.out.println(a + " , " + b);
                    return a + b;
                });
        System.out.println("result = " + result.orElse(0));

        int result2 = IntStream.of(1, 2, 3, 4, 5)
                .reduce(100, (a, b) -> {
                    System.out.println(a + " , " + b);
                    return a + b;
                });
        System.out.println("result2 = " + result2);

        Integer result3 = IntStream.range(1, 5)
                .boxed() // IntStream에는 메소드가 3개 짜리인 reduce가 없기때문에 IntStream -> Stream으로 박싱
                .reduce(0,
                        (a, b) -> {
                            System.out.println("accumulator : " + a + " , " + b);
                            return a + b;
                        },
                        (x, y) -> {
                            System.out.println("combine : " + x + " , " + y);
                            return x + y;
                        });
        System.out.println("result3 = " + result3);

        Integer result4 = Stream.of(1, 2, 3, 4)
                .parallel()
                .reduce(0,
                        (a, b) -> {
                            System.out.println("accumulator : " + a + " , " + b);
                            return a + b;
                        },
                        (x, y) -> {
                            System.out.println("combine : " + x + " , " + y);
                            return x + y;
                        });
        System.out.println("result4 = " + result4);

        Integer result5 = Stream.of(1, 2, 3, 4)
                .parallel()
                .reduce(100,
                        (a, b) -> {
                            System.out.println("accumulator : " + a + " , " + b);
                            return a + b;
                        },
                        (x, y) -> {
                            System.out.println("combine : " + x + " , " + y);
                            return x + y;
                        });
        System.out.println("result5 = " + result5);

        String s = Stream.of("a", "b", "c")
                .collect(Collectors.joining());
        System.out.println("s = " + s);

        String s1 = Stream.of("a", "b", "c")
                .collect(Collectors.joining(","));
        System.out.println("s1 = " + s1);

        String s2 = Stream.of("a", "b", "c")
                .collect(Collectors.joining(",","{","}"));
        System.out.println("s2 = " + s2);


    }
}

