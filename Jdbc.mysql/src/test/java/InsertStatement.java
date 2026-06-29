import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStatement 
{
	
	private static final String URL = "jdbc:mysql://localhost:3306/automationtestdata";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "cfg1234";
    
    public static void main(String[] args) 
    {
    	try 
    	{
			Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			Statement stm = connection.createStatement();
			
			String query = "Insert into book_detl Values" + "('BI011','Testing','API','Raghu','ABC','S','2026',600)";
			
			int row = stm.executeUpdate(query);
			
			System.out.println(row + " inseted successfully");
			
			stm.close();
			connection.close();
			
		} catch (SQLException e) 
    	{
			System.out.println("Connection Falied");
			e.printStackTrace();
		}

	}

}
