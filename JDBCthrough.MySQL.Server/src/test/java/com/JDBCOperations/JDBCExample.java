package com.JDBCOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/automationtestdata";
        String user = "root";
        String pass = "cfg1234";

        String query = "SELECT * FROM book_detl WHERE price > 300";

        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("Book_No | Title | Sub_Code | Author");

            while (rs.next()) {
                System.out.println(
                        rs.getString("book_no") + " | " +
                        rs.getString("title") + " | " +
                        rs.getString("sub_code") + " | " +
                        rs.getString("author"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}