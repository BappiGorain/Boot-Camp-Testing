package com.JDBCOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStatement {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/automationtestdata";
        String user = "root";
        String password = "cfg1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            String query = "INSERT INTO book_detl VALUES "
                    + "('BI010','Coforge','Sel','Raghu','XYZ','S','2026',900.0000)";

            int rows = stmt.executeUpdate(query);

            System.out.println(rows + " Record Inserted Successfully");

            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}