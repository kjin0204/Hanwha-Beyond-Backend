package com.ohgiraffers.chap06.section01.dp;

import java.util.Arrays;

public class Application3 {
    public static Integer solution(Integer n) {
        int[] dp = new int[n + 1];
        int[] bp = new int[n + 1];

//        dp[0] = 1;
//        dp[1] = 1;
//        dp[2] = 1;
//        dp[3] = 1;

        /* 설명. bottom-up */
        bottomUp(n, bp);

        System.out.println(Arrays.toString(bp));


        /* 설명. 탑다운 방식 */
        padovan(n, dp);
//        System.out.println(Arrays.toString(dp));
        return dp[n];

    }

    private static void bottomUp(Integer n, int[] bp) {
        bp[1] = 1;
        bp[2] = 1;
        bp[3] = 1;

        if (n < 4)
            bp[n] = 1;
        else {
            for (int i = 1; i <= 3; i++) {
                bp[i] = 1;
            }
            for (int i = 4; i <= n; i++) {
                bp[i] = bp[i - 2] + bp[i - 3];
            }
        }

    }

    private static int padovan(Integer n, int[] dp) {
//        if (n == 1) return 1;
//        if (n == 2) return 1;
//        if (n == 3) return 1;

        if (n < 4) {
            dp[n] = 1;
        }


        /* 설명. 조건문을 통해 점화식을 적용하는 것은 필요할 때만 적용(가지치기) */
        if (dp[n] == 0)
            dp[n] = padovan(n - 2, dp) + padovan(n - 3, dp);


        return dp[n];

    }
}
