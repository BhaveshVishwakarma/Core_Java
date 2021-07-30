package com.neosoft.basics;
import java.util.*;
public class PatternDemo 
{

	public static void main(String[] args) 
	{
		int n,r,s,p=1,k;
		System.out.print("Enter the Row Number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(r=1;r<=n;r++)
		{
			for(k=n-1;k>=r;k--)
			{
				System.out.print(" ");
			}
			for(s=1;s<=r;s++)
			{
				System.out.print(p+" ");
				p++;
			}
			System.out.println("\n");
		}
	}

}
