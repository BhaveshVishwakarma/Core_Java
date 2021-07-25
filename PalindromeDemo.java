package com.neosoft.basics;
import java.util.*;
public class PalindromeDemo 
{
	
	public static void main(String[] args)
	{
		int n,cpy,rem,rev=0;
		System.out.print("Enter the Number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		cpy=n;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			rev=(rev*10)+rem;
		}
		
		if(cpy==rev)
		{
			System.out.println(rev+" is a Palindrome Number");
		}
		else
		{
			System.out.println(rev+" is not a Palindrome Number");
		}
		sc.close();
	}

}
