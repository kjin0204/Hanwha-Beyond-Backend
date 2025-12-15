package com.ohgiraffers.section01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application2 {
    public static void main(String[] args) {

        Connection con = getConnection();
        System.out.println("con = " + con);

        Statement stmt = null;
        ResultSet rset = null;

        /* 설명. Scanner를 활용해 사용자의 입력에 따른 사원 조회 */
        Scanner sc = new Scanner(System.in);
        System.out.print("조회하고자 하는 사원의 번호를 입력하세요: ");
        String empId = sc.nextLine();

        try {
            stmt = con.createStatement();
            rset = stmt.executeQuery("select * from employee " +
                    "where emp_id = '" + empId + "'");


            if(rset.next()){
                System.out.println(rset.getString("emp_id") + " , " + rset.getString("emp_name"));
            } else {
                System.out.println("해당 " + empId + "번의 사원은 존재하지 않습니다.");
            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(rset);
            close(stmt);
            close(con);
        }
    }
}
