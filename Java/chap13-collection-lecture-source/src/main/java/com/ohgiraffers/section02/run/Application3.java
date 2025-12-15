package com.ohgiraffers.section02.run;

import java.util.*;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. TreeSet에 대해 이해하고 활욜할 수 있다. */
        /* 수업목표. LinkedHashSet에 대해 이해하고 활욜할 수 있다. */
        Set<String> tSet = new TreeSet<>();
        tSet.add("ramen");
        tSet.add("prok");
        tSet.add("kimchi");
        tSet.add("firedEgg");
        tSet.add("soup");
        tSet.add("soup");
        System.out.println("lSet = " + tSet);

        Iterator<String> iter = tSet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        /* 설명.
         *  로또 번호발생기(feat. 보너스 번호 추출 제외)
         *  1 ~ 45까지 중복되지 않고 오름차순 정렬된 6개의 번호 발생하기
         * */

        Set<Integer> lotto = new TreeSet<>();
        while (lotto.size() < 6) {
            lotto.add((int) (Math.random() * 45) + 1);
        }

        System.out.println("lotto = " + lotto);

        /* 설명. 배열을 활용해서 같은 로또 번호 발생기를 만들어 보자. */
        int[] arr = new int[6];

//        int index = 0;
//        while (index < 6) {
//            int num = (int) (Math.random() * 45) + 1;
//            for (int i = 0; i < arr.length; i++) {
//
//                if (arr[i] == num) {
//                    break;
//                }
//
//                if (i == arr.length - 1) {
//                    arr[index] = num;
//                    index++;
//                }
//
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("arr = " + arr[i]);
//        }

        System.out.println("======= Set ========");
        int index = 0;
        Set<Integer> set = new HashSet<>();

        while (index < 6) {
            int num = (int) (Math.random() * 45) + 1;

            if(!set.contains(num)) {
                set.add(num);
                arr[index] = num;
                index++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr = " + arr[i]);
        }

    }
}
