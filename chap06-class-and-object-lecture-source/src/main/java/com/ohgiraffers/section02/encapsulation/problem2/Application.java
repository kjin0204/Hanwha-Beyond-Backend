package com.ohgiraffers.section02.encapsulation.problem2;

public class Application {
    public static void main(String[] args) {

        Monster m = new Monster();
        m.name = "드라큘라";
//        m.hp = 200;
        m.setInfo2(200); // hiding 은닉화
                        // 필드에 직접 접근보다 결합이 낮아짐.
    }
}
