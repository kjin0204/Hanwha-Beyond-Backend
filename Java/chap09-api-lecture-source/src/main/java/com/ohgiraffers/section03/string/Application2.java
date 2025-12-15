package com.ohgiraffers.section03.string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 문자열 분리에 대해 이해하고 적용할 수 있다. */
        /* 설명.
         *  문자열을 특정 구분자로하여 분리한 문자열을 반환하는 두 가지 방법
         *  1. split(): 정규표현식을 이용하여 비정형화된 문자열을 분리한다.
         *              (String을 파싱하여 String[]로 반환해주며 대괄호([])를 활용해 여러 구분자 등록 가능)
         *  2. StringTokenizer:
        * */

        /* 목차. 1. split() 활용 */
        String emp1 = "100/홍길동/서울/영업부";
        String emp2 = "200/유관순//총무부";
        String emp3 = "300/이순신?경기도/";

        String[] empArr1 = emp1.split("/");
        String[] empArr2 = emp2.split("/");
        String[] empArr3 = emp3.split("[/?]");

        System.out.println(Arrays.toString(empArr1));
        System.out.println(Arrays.toString(empArr2));
        System.out.println(Arrays.toString(empArr3));

        /* 목차. 2. StringTokenizer 활용 */
        String colors = "red, yellow, green, puple? blue";
        StringTokenizer st = new StringTokenizer(colors,", ?"); // 구분자를 ',' ' ' '?' 로 3가지 조건 을 넣음


        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
