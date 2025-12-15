package com.ohgiraggers.section03.branching;

public class A_break {
    public static void testSimpleBreakStatement() {

        int num = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < 10; j++) {
                System.out.println("i = " + i);
                System.out.println("j = " + j);
                if(j == 3){
                    break; //자신이 소속된 가장 안쪽 반복문만 빠져나감.
                }
            }

        }
    }
}


