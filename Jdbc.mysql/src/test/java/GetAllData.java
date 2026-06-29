import java.sql.*;


public class GetAllData
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
			ResultSet rs = stm.executeQuery("SELECT * from book_detl");
			
			ResultSetMetaData metaData = rs.getMetaData();
			int colCount= metaData.getColumnCount();
			
			
			while (rs.next()) {
				for(int i=1;i<=colCount;i++)
				{
					System.out.print(rs.getString(i)+"\t");
				}
				System.out.println();	
			}
			
		} catch (SQLException e) 
    	{
			System.out.println("Connection Falied");
			e.printStackTrace();
		}

	}
}
