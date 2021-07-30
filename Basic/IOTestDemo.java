package com.neosoft.basics;
import java.io.*;

public class IOTestDemo {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name : ");
		String name=br.readLine();
		
		System.out.println("Enter your course : ");
		String course=br.readLine();
		
		System.out.println("Enter your age : ");
		int age=2021-Integer.parseInt(br.readLine());
		
		System.out.println("Hi "+name+" your course is "+course);
		System.out.println("Your Birth year is "+age);
		
	}

}
