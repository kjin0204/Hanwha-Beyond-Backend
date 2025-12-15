package com.ohgiraffers.section03.uses;

import java.io.*;

public class Appilcation2 {
    public static void main(String[] args) {

        /* 수업목표. try-with-resouece 구문을 이해하고 활욜할 수 있다.(feat. finally 안씀) */

        try(BufferedReader br = new BufferedReader(new FileReader("test.dat"))) {} catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
