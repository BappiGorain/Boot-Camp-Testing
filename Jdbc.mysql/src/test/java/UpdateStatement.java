import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStatement 
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
			
			String query = "Update book_detl Set yop='2000' where book_no='BI002'";
			
			int rowsUpdated = stm.executeUpdate(query);
			
			if( rowsUpdated > 0)
			{
				System.out.println(rowsUpdated + " Updated successfully");
			}
			else
			{
				System.err.println("No Rows are Updated");
			}
			
			stm.close();
			connection.close();
			
		} 
    	catch (SQLException e) 
    	{
			System.out.println("Connection Falied");
			e.printStackTrace();
		}

	}

}
