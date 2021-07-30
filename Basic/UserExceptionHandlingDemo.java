package com.neosoft.basics;
import java.util.*;
public class UserExceptionHandlingDemo 
{
	public static void main(String[] args)
	{
		System.out.println("User Define Exception Handling");
		withdrawExceptionDemo();
	}
	
	private static void withdrawExceptionDemo()
	{
		try
		{
			int amt,wdraw,bal;
			System.out.print("Enter the Deposite Amount : ");
			Scanner sc=new Scanner(System.in);
			amt=sc.nextInt();
			System.out.print("Enter the Withdraw Amount : ");
			wdraw=sc.nextInt();
			sc.close();
			if(amt<wdraw)
				throw new withdrawException("Insufficient Balance");
			bal=amt-wdraw;
			System.out.println("Balance is : "+bal);
		}
		catch(withdrawException e)
		{
			System.out.println(e);
		}
		
	}
}
