package dbms_1;

import java.sql.ResultSet;
import java.util.Scanner;

public class customer 
{
	static String username;
	static Scanner sc;
	public static void main(String user) 
	{
		username = user;
		System.out.println("Hi "+username);
		sc = new Scanner(System.in);
		System.out.println("1. Search a product");
		System.out.println("2. Display all products");
		System.out.println("3. Display all category");
		
		System.out.println("10.Log out");
		
		while(true)
		{				
			System.out.print("Enter querry: ");
			int input = Integer.parseInt(sc.nextLine());
			if(input==1)
			{
				search();
			}
			else if(input==2)
			{
				querries.displayallproduct();
			}
			else if(input==3)
			{
				querries.displaycat();
			}

			else if(input==10)
			{
				ui.main(null);
			}
			else
			{
				System.out.println("Invalid Input");
			}
			
		}
		
	}
	
	


	public static void search()
	{
		System.out.print("Enter product name: ");
		String name = sc.nextLine();
		ResultSet res = querries.search(name);
		if(res!=null)
		{
			
		}
		else
		{
			System.out.println("No product found");
		}
	}
	
	

}









