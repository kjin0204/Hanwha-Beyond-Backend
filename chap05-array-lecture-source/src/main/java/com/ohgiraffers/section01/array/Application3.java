package com.ohgiraffers.section01.array;

import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. 배열에 들어갈 초기 기본값 및 전달인자로써의 배열 자료형 */
        /* 설명.
         *  값의 형태별 기본값
         *  정수 : 0
         *  실수 : 0.0
         *  논리 : false
         *  문자 : \0000, \0
         *  참조 : null
        * */

        int[] iArr = new int[5];
        iArr = null;
        System.out.println("iArr = " + iArr);

        /* 설명. 크기및 초기값 설정 */
        int[] iArr2 = { 1, 2, 3, 4, 5};
        int[] iArr3 = new int[] { 5, 6, 7, 8, 9 };

        System.out.println("iArr2 = " + Arrays.toString(iArr2));
        System.out.println("iArr3 = " + Arrays.toString(iArr3));

        /* 설명. 다만 new 연산자를 생략해서 안되는 경우가 있다. */
        test(iArr2);

//        test({10,20,30,40,50}); 이건 불 가능.
        test(new int[]{10,20,30,40,50}); //이건 가능
    }

    private static void test(int[] iArr2) {
        System.out.println("메소드에서 넘겨받은 배열 확인 : " + Arrays.toString(iArr2));
    }
}
