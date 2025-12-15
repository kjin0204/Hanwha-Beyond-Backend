package com.ohgiraffers.section04.dto;

public class Application {
    public static void main(String[] args) {
        UserDTO user1 = new UserDTO();

        // println은 참조형 매겨변수를 받으면 해당 객체의 toString을 찾으며 있으면 해당 메소드를 실행
        System.out.println("user1 = " + user1);

        UserDTO user2 = new UserDTO("user01","pass01","홍길동",new java.util.Date());

        System.out.println("user2 = " + user2);

        user2.setName("유관순");
        System.out.println("user2 = " + user2.getName());
    }
}
