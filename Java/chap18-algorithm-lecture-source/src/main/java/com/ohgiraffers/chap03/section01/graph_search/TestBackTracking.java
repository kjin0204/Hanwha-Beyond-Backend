package com.ohgiraffers.chap03.section01.graph_search;

public class TestBackTracking {

    static int count = 0;
    static int n = 0;
    static int[] queens;

    public static int solution(int size) {

        count = 0;
        n = size;
        queens = new int[n];


        playQueen(0, 0);

        return 0;
    }

    private static void playQueen(int row, int col) {

        for (int i = 0; i < n; i++) {
            if (Math.abs(queens[row] - i) == Math.abs(queens[col] - i) ) {
//char d ="123".charAt
                char d = 's';
//                "sd".equals
                String[] test = "E 5".split(" ");
                char d1= test[0].charAt(0);

            }
        }
    }
}
