package com.neosoft.java8;


public class LambdaTestMaths 
{

	public static void main(String[] args) 
	{
		Sample s=()->
		{
			System.out.println("Message is : "+" Welcome to Java !!!");
		};
		s.show();
		
		LambdaTestMaths lambdaTest=new LambdaTestMaths();
		
		MathOperation add=(int a,int b)->a+b;
		MathOperation sub=(int a,int b)->a-b;
		MathOperation multi=(int a,int b)->a*b;
		MathOperation div=(int a,int b)->a/b;

		System.out.println("100+50 = "+lambdaTest.operate(100,50,add));
		System.out.println("100-50 = "+lambdaTest.operate(100,50,sub));
		System.out.println("100*50 = "+lambdaTest.operate(100,50,multi));
		System.out.println("100/50 = "+lambdaTest.operate(100,50,div));
		
		MessageService messageService=message->System.out.println("Hi "+message);
		messageService.sayMessage("Java");
	}



	@FunctionalInterface
	interface MathOperation
	{
		int operations(int a,int b);
	}

	@FunctionalInterface
	interface MessageService
	{
		void sayMessage(String message);
	}

	private int operate(int a,int b,MathOperation mathOperation)
	{
		return mathOperation.operations(a, b);
	}
}

@FunctionalInterface
interface Sample1
{
	void show();
}