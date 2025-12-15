package com.ohgiraffers.section02.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {

        Set<String> hSet = new HashSet<>();
        hSet.add(new String("java"));
        hSet.add(new String("mariaDB"));
        hSet.add(new String("servlet"));
        hSet.add(new String("spring"));
        hSet.add(new String("html"));

        System.out.println("hset에 지정된 값들: " + hSet);
        hSet.add(new String("mariaDB"));
        System.out.println("hset에 지정된 값들: " + hSet);

        /* 설명. Set계열 역시 iterable을 상속 받아 iterator()를 호출해 반복자(Iterator)를 활용할 수 있다. */
        Iterator<String> iter = hSet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        /* 설명. Set을 인덱스 개념을 활용하고 싶으면 toArray()를 쓰되 다운캐스팅에 유의 */
        Object[] objArr = hSet.toArray();
        for (int i = 0; i < objArr.length; i++) {
            System.out.println(objArr[i]);
        }

    }
}

