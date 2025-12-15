package com.ohgiraffers.section04.wrapper;

public class Application3 {
    public static void main(String[] args) {
        String b = Byte.valueOf((byte)1).toString();
        String s = Short.valueOf((short)1).toString();
        String i = Integer.valueOf((int)1).toString();
        String l = Long.valueOf((long)1L).toString();
        String f = Float.valueOf((float) 1f).toString();
        String d = Double.valueOf((double)1).toString();
        String isTrue = Boolean.valueOf(true).toString();
        String ch = Character.valueOf('a').toString();

        String byteStre = (byte)1 + "";
    }
}
