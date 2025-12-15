package com.ohgiraffers.section01.stringbuilder;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. StringBuilder의 자주 사용되는 메소드의 용법 및 원리를 이해할 수 있다. */
        StringBuilder sb = new StringBuilder("javamariaDB");

        /* 설명. 1. delete() (2 ~ 5번 인덱스의 문자 삭제) */
        System.out.println("delete(): " + sb.delete(2,5)); //jaariaDB
        /* 설명. 2. deleteCharAt 특정 위치의(인덱스) 문자를 삭제*/
        System.out.println("deleteCharAt(): " + sb.deleteCharAt(2)); //jariaDB
        /* 설명. 3. inser() 특정 위치이에 문자를 삽입*/
        System.out.println("insert(): " + sb.insert(1,"vao")); // jvaoariaDB
        System.out.println("insert(): " + sb.insert(0,"j")); // jjvaoariaDB
        System.out.println("insert(): " + sb.insert(sb.length(),"jdbc")); // jjvaoariaDBjdbc
        /* 설명. 4. reverse() 문자열을 뒤짚음*/
        System.out.println("reverse(): " + sb.reverse()); // cbdjBDairaoavjj
    }
}
