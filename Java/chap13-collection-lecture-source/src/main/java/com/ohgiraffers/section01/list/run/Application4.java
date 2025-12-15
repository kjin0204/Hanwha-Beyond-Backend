package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. Stack에 대해 이해하고 사용할 수 있다. */
        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        /* 설명. search()는 위에서부터 몇 번째에 있는 것인지를 통해 확인할 수 있다.  */
        System.out.println("위에서 두번쨰 : " + integerStack.search(2));

        System.out.println("integerStack = " + integerStack);
        System.out.println("peek() : " + integerStack.peek());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("size() : " + integerStack.size());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
    }
}
