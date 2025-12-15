package com.ohgiraffers.section01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application1 {
    public static void main(String[] args) {

        Connection con = getConnection();
        System.out.println("con = " + con);

        Statement stmt = null;      // SQL 및 쿼리 실행 결과를 싣고 dbms를 오가는 트럭같은 개념
        ResultSet rset = null;      // 쿼리(SELECT)의 결과(JAVA의 타입)

        try {
            stmt = con.createStatement();
            rset =  stmt.executeQuery("SELECT * FROM EMPLOYEE");

            /* 설명. 다중행 조회 결과를 반복하며 추출 */
            while(rset.next()){
                /* 설명. 반복문 안에서는 단일행을 하나하나 컬럼별로 꺼내쓴다. */
                System.out.println(rset.getString("EMP_NAME") + ", " + rset.getInt("SALARY"));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            close(rset);
            close(stmt);
            close(con);
        }
    }
}
