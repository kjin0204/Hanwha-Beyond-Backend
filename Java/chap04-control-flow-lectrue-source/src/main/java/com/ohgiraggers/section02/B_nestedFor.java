package com.ohgiraggers.section02;

import java.util.Scanner;

public class B_nestedFor {
    public void printGugudanFromTwoToNine() {

        /* 설명.
         *  2단
         *   2 * 1 = 2
         *   2 * 2 = 4
         *  ....
         *  9단
         *   9 * 1 = 9
         *   9 * 2 = 18
         *  ....
         *   9 * 9 = 81
         * */


        for (int i = 2; i <= 9; i++) {
            System.out.printf("%d단\n", i);
            printGuguDan(i);
        }

    }

    /* 설명. 단수가 넘어오면 해당 단수의 구구단 출력을 담담하는 메소드 */
    private void printGuguDan(int i) {
        for (int j = 1; j <= 9; j++) {
            System.out.println(i + " * " + j + " = " + i * j);
        }
    }

    /* 설명. 별찍기 */
    /* 설명.
     *      *
     *     **
     *    ***
     *   ****
     *  *****
     * */

    public void testForExample() {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수 하나를 입력하세요 : ");
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            printSpaceAndStars(count, i);
            System.out.println();
        }


        System.out.println();
        System.out.println();



    }

    private static void printSpaceAndStars(int count, int i) {
        for (int j = 0; j < count; j++) {
            if (j < count - i - 1) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
    }

}
