package com.JDBCOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BookDeleteExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/automationtestdata";
        String user = "root";
        String password = "cfg1234";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {

            String deleteQuery = "DELETE FROM book_detl WHERE book_no='PH003'";

            int rowsDeleted = stmt.executeUpdate(deleteQuery);

            if (rowsDeleted > 0) {
                System.out.println("Delete successful. Rows deleted: " + rowsDeleted);
            } else {
                System.out.println("No record found to delete.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}