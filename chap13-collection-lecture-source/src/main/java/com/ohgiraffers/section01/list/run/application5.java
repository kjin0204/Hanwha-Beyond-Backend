package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class application5 {
    public static void main(String[] args) {


//        Queue que = new Queue(); // 인터페이스라 구현하는 하위 타입으로 객체 생성해서 써야 함.
        Queue que = new LinkedList();

        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");
        System.out.println("que = " + que);

        System.out.println("peek() : " + que.peek());
        System.out.println("que = " + que);
        System.out.println("queue 사이즈 : " + que.size());
        System.out.println("pool() : " + que.poll());
        System.out.println("queue 사이즈 : " + que.size());

        Queue<Integer> priorityQue = new PriorityQueue<>(); // 우선순위 큐
        priorityQue.offer(4);
        priorityQue.offer(1);
        priorityQue.offer(2);
        priorityQue.offer(3);
        priorityQue.offer(5);

        System.out.println("priorityQue = " + priorityQue);

    }

}
