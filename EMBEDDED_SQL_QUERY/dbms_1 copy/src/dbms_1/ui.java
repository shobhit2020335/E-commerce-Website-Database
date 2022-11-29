package dbms_1;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ui {

	public static void main(String[] args) 
	{
		try {
			querries.connect(null);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		while(true)
		{			
			System.out.println("---------------------------");
			
			System.out.println("1.login as customer");
			System.out.println("2.Custom Sql querry");
			System.out.println("3.Exit");
			
			System.out.print("Enter Querry: ");
			Scanner sc = new Scanner(System.in);
			int input = Integer.parseInt(sc.nextLine());
			if(input==1)
			{
				System.out.print("Enter username: ");
				String phone = sc.nextLine();
				System.out.print("Enter Password: ");
				String password = sc.nextLine();
				if(true)//varify_customer(phone))
				{
					System.out.println("-----Logged in as customer-----");					
					customer.main(phone);
					System.out.println("---------------------------");
					break;
				}
				else
				{
					System.out.println("Invalid input.Try again");
				}
			}
			else if(input==2)
			{
				querries.customrun();
			}
			else if(input==3)
			{
				System.out.println("Quiting...");
				System.out.println("---------------------------");
				break;
			}
				
		}

	}
//	
//	private static boolean varify_customer(String phone) 
//	{
//		System.out.println("phone: "+phone);
//		ResultSet res = querries.customers(phone);
//		try {
//			//System.out.print("  jhbjh"+res);
//			String s = res.getString(0);
//			System.out.println("s-> :"+s+"   here");
//			if(s.equals(""))
//			{
//				System.out.println("skdjbjsbdv");
//				return false;
//			}
//			else
//			{
//				System.out.println("true");
//				return true;
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return false;
//		}
//		
//	}

}

























