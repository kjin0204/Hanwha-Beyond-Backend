package com.ohgiraffers.section02;

import java.sql.Connection;

import static com.ohgiraffers.section02.JDBCTempleate.close; //클래스명 생략 가능
import static com.ohgiraffers.section02.JDBCTempleate.getConnection; //클래스명 생략 가능

public class Application {
    public static void main(String[] args) {
        /* 설명. main 로직에서 Connection 객체가 필요한 순간에 한줄 코딩으로 받아내기 */
//        Connection con = JDBCTempleate.getConnection();
        // static 메소드는 import 할때 메소드명까지 넣어주면 클래스명 생략 하고 사용 가능
        Connection con = getConnection();

        System.out.println("con = " + con);

        /* 설명. connection 객체를 활용한 구문(SQL문을 통해 DB와의 CRUD) */

        // static 메소드는 import 할때 메소드명까지 넣어주면 클래스명 생략 하고 사용 가능
        close(con);
    }
}
