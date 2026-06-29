package CURDCaseStudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class SelectStatement 
{
	private static final String URL = "jdbc:mysql://localhost:3306/read_demo";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "cfg1234";
	
	public static void main(String[] args)
	{
		Connection connection = null;
		try 
		{
//			driver load
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			Connection
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
//			Statement
			Statement stm = connection.createStatement();
			
//			query;
			String query = "Select * from departments";
			
//			Execute Query
			ResultSet executeQuery = stm.executeQuery(query);
			
//			Get Data 
			
			ResultSetMetaData rsmd = executeQuery.getMetaData();
			
			
//			Number of Rows
			int columnCount = rsmd.getColumnCount();
			
			System.out.println(columnCount+" Column has returned");
			
//			Print
			
			
			
			
			
			
		} 
		catch (Exception e) 
		{	
			System.out.println("Connection Not Established");
			e.printStackTrace();
		}
	}
}
