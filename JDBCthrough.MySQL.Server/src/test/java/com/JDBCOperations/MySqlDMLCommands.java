package com.JDBCOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySqlDMLCommands {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/automationtestdata";
        String user = "root";
        String pass = "cfg1234";

        try {
            // Load driver (optional in newer JDBC)
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();

            // INSERT
            String insertQuery = "INSERT INTO book_detl VALUES "
                    + "('PH005','Mobility','Che','Raghavendra','ABC','S','2023',800.0000)";

            // UPDATE
            String updateQuery = "UPDATE book_detl SET author='RaghuBNR' WHERE author='Raghavendra'";

            // DELETE
            String deleteQuery = "DELETE FROM book_detl WHERE book_no='PH003'";

            int insertRows = stmt.executeUpdate(insertQuery);
            int updateRows = stmt.executeUpdate(updateQuery);
            int deleteRows = stmt.executeUpdate(deleteQuery);

            System.out.println(insertRows + " record inserted");
            System.out.println(updateRows + " record updated");
            System.out.println(deleteRows + " record deleted");

            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}