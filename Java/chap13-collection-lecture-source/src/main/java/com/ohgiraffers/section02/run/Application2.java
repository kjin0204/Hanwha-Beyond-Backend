package com.ohgiraffers.section02.run;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. LinkedHashSet에 대해 이해하고 활욜할 수 있다. */
        Set<String> lSet = new LinkedHashSet<>();
        lSet.add("ramen");
        lSet.add("prok");
        lSet.add("kimchi");
        lSet.add("firedEgg");
        lSet.add("soup");
        lSet.add("soup");
        System.out.println("lSet = " + lSet);

        Iterator<String> iter = lSet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


    }
}
