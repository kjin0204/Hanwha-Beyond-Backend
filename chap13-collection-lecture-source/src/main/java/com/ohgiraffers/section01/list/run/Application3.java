package com.ohgiraffers.section01.list.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. List계열을 출력하는 4가지 방법 */
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("watermelon");
        list.add("pineapple");

        /* 설명. 1. toString() 활용하기 */
        System.out.println("list = " + list);
        System.out.println();
        System.out.println("======= for =======");
        /* 설명. 2. for문 활용하기 */
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
        System.out.println("======= for-each =======");
        /* 설명. 3. for-each문 활용하기 */
        for(String s : list){
            System.out.print(s + ", ");
        }
        System.out.println();
        System.out.println("======= iterator =======");
        /* 설명. 4. iterator 활용하기 */
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + ", ");
        }

        /* 설명. 추가 메소드 */
        list.clear(); //List 비움
        list.isEmpty(); //리스트가 비어있는지 확인.
    }
}
