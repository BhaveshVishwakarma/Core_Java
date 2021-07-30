package com.neosoft.java8;

@FunctionalInterface
interface Sample{
	public void show();
}
public class LambdaTest {

	public static void main(String[] args) 
	{
		String msg="Welcome to Java !!!";
		Sample s=()->
		{
			System.out.println("Message : "+msg);
		};
		s.show();

	}

}
