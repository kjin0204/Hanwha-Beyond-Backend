package com.ohgiraffers.section03.sqlInjection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application1 {

    private static String empId = "200";
    private static String empName = "' OR 1=1 AND EMP_ID = '200";

    public static void main(String[] args) {
        Connection con = getConnection();
        Statement stmt = null;
        ResultSet rset = null;
        String query = "select * from employee where emp_id='" + empId + "' and emp_name='" + empName + "'";
        //sqlInjection
//        String query = "SELECT * FROM EMPLOYEE WHERE EMP_ID = '200' AND EMP_NAME = '' OR 1=1 AND EMP_ID = '200'
        try {
            stmt = con.createStatement();
            rset = stmt.executeQuery(query);

            if(rset.next()){
                System.out.println(rset.getString("emp_name"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            close(rset);
            close(stmt);
            close(con);
        }

    }
}
