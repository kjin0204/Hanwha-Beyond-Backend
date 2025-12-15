package com.ohgiraffers.section01.array;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 배열에 대해 이해하고 배열의 사용 목적을 이해할 수 있다. */

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        int sum = 0;

        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;

        System.out.println("sum = " + sum);

        // 대입연산자의 좌측 arr은 첫번째 데이터의 주소(heap영역)만 저장.
        int[] arr = new int[5]; // heap 영역에 [0][0][0][0][0]
        System.out.println("arr = " + arr[0]);

        // arr은 참조 변수로 아래와 같이 출력하면 주소값을 출력 하게 됨.
        System.out.println("arr = " + arr);

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for (int i = 0; i < arr.length; i++)
            arr[i] = 10 * (i + 1);

        // Arrays.toString(arr) 1차원 배열의 값을 모두 출력 함.
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
