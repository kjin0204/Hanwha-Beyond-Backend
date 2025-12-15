package com.ohgiraffers.section01.insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application1 {
    public static void main(String[] args) {

        Connection con = getConnection();
        PreparedStatement pstmt = null;

        /* 설명.
         *  DML(insert, update, delete) 작업 시에는 반환 결과가 int값이 된다(ResultSEt x)
         *  그리고 조회에서는 executeQuery() DML에서는 executeUpdate()를 사용한다.
         * */

        int result = 0;

        String query = "insert into tbl_menu\n" +
                "(menu_name, menu_price, category_code, orderable_status)\n" +
                "values\n" +
                "(?, ?, ?, ?)";

//        System.out.println(query);

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, "커피맛식혜");
            pstmt.setInt(2, 2000);
            pstmt.setInt(3, 6);
            pstmt.setString(4, "Y");

            result = pstmt.executeUpdate();

            /* 설명. JDBCTemplate에서 수동 커밋 설정 이후에는 commit 혹은 rollback 수동으로 실행 해야 함 */
            if (result > 0) {
                System.out.println("insert 결과 : " + result + "개의 행이 추가됨");
                con.commit();
            } else {
                System.out.println("insert 실패");
                con.rollback();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(pstmt);
            close(con);
        }
    }
}
