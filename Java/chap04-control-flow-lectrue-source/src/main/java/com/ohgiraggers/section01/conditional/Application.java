package com.ohgiraggers.section01.conditional;

public class Application {
    public static void main(String[] args) {
        A_if a = new A_if();
//        a.testSimpleIfStatement();
//        a.testNestedIfStatement();

        B_ifElse b = new B_ifElse();
//        b.testSimpleIfElseStatement();
//        b.testNestedIfElseStatement();


//        C_switch c = new C_switch();
//        c.testSimpleSwitchStatement();

//        int[] test = {100,95,90,85,80,75,70,65,60,59};
//        for(int i = 0; i < 10 ; i ++)
//        {
//            d.testNestedIfElseStatement("강형규",test[i]);
//
//        }

        D_test d = new D_test();
        d.testNestedIfElseStatement();


    }
}
