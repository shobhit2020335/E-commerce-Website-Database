
package dbms_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class querries
{
	static Connection con;
	public static void connect(String args[])throws SQLException
	{
		String url = "jdbc:mysql://localhost:3306/project";
		String username = "root";
		String password = "x1x2x3x4";
		//String querry = "SELECT * FROM project.Product WHERE p_id<10;";		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");	
		}catch(ClassNotFoundException e )
		{
			e.printStackTrace();	}
		try 
		{	con = DriverManager.getConnection(url, username, password); 
			System.out.println("connected successfully");
		}catch(SQLException e)
		{	e.printStackTrace();	}
		
	}
	
	public static ResultSet search(String pname)
	{
		ResultSet result = null;
		try 
		{
			String querry = "SELECT * FROM Product WHERE p_name = '"+pname+"'";
			Statement statement = con.createStatement();
			result = statement.executeQuery(querry);
			ResultSetMetaData rsmd = result.getMetaData();
			while(result.next())
			{
				String u = "";
				for(int i=1;i<rsmd.getColumnCount();i++)
				{
					u+=result.getString(i)+" :"; 
				}
				System.out.println(u);
			}
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			
		}
		return result;
	}

	
	public static void displayallproduct() 
	{
		ResultSet result = null;
		try 
		{
			String querry = "SELECT * FROM Product";
			Statement statement = con.createStatement();
			result = statement.executeQuery(querry);
			ResultSetMetaData rsmd = result.getMetaData();
			System.out.println("p_name : p_id : price : available quantity");
			while(result.next())
			{
				String u = "";
				for(int i=1;i<rsmd.getColumnCount();i++)
				{
					u+=result.getString(i)+" :"; 
				}
				System.out.println(u);
			}
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			
		}
	}

	public static void displaycat() 
	{ 
		try 
		{
			String querry = "SELECT * FROM Category";
			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery(querry);
			ResultSetMetaData rsmd = result.getMetaData();
			while(result.next())
			{
				String u = "";
				for(int i=1;i<rsmd.getColumnCount()+1;i++)
				{
					u+=result.getString(i)+" :"; 
				}
				System.out.println(u);
			}	
		}catch(SQLException e)
		{
			e.printStackTrace();
			
		}
		
	}

	

	public static void customrun() {

		ResultSet result = null;
		try 
		{
			Scanner sc = new Scanner(System.in);
			String querry = sc.nextLine();
			Statement statement = con.createStatement();
			result = statement.executeQuery(querry);
			ResultSetMetaData rsmd = result.getMetaData();
			while(result.next())
			{
				String u = "";
				for(int i=1;i<rsmd.getColumnCount();i++)
				{
					u+=result.getString(i)+" :"; 
				}
				System.out.println(u);
			}
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			
		}
		
	}

	
	
	
}
















