package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. finally를 활용한 try-catch문을 이해할 수 있다. */

        ExceptionTest et = new ExceptionTest();
        try {
            et.checkEnoughMoney( -2000,5000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally
        {
            System.out.println("finlally 블럭의 내용 동작함..");
        }
        System.out.println("프러그램을 종료 합니다.");
    }
}
