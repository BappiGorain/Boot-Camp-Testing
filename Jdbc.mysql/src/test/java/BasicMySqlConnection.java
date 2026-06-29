import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BasicMySqlConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/automationtestdata";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "cfg1234";

    public static void main(String[] args) {

        Connection connection = null;

        try {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            System.out.println(" Connected to MySQL database successfully!");

        } catch (ClassNotFoundException e) {
            System.err.println(" MySQL JDBC Driver not found!");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println(" Failed to connect to MySQL database!");

            System.out.println("Error Code : " + e.getErrorCode());
            System.out.println("SQL State  : " + e.getSQLState());
            System.out.println("Message    : " + e.getMessage());

            e.printStackTrace();

        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                    System.out.println(" Connection closed successfully");
                }
            } catch (SQLException e) {
                System.out.println(" Error in closing connection");
                e.printStackTrace();
            }
        }
    }
}