package com.ohgiraffers.section03.increment;

public class Application {
    public static void main(String[] args) {
        
        /* 수업목표. 단항 연산자이자 증감연산자에 대해 이해하고 활욜할 수 있다. */
        /* 필기. 전위 연산자와 후위연산자. 연산기호가 변수 앞에 있으면 전위, 뒤에있으면 후위 */
        int num = 20;
        System.out.println("num = " + num);

        num++;
        System.out.println("num = " + num);

        ++num;
        System.out.println("num = " + num);
        
        --num;
        System.out.println("num = " + num);
        
        num--;
        System.out.println("num = " + num);


        /* 필기. 후위 연산자는 출력이나 연산이 끝난 이후 동작. */
        int firstNum = 20;
        int result = firstNum++ + 3;
        System.out.println("result = " + result);               //23
        System.out.println("firstNum = " + firstNum);           //21
        System.out.println("firstNum++ = " + firstNum++);       //21
        System.out.println("firstNum = " + firstNum);           //22


    }
}
