package com.neosoft.java8;

@FunctionalInterface
interface Showable
{
	void show();
}

@FunctionalInterface
interface Showable2
{
	void show(String msg);
}

class TestConstruct
{
	public TestConstruct(String msg)
	{
		System.out.println(msg);
	}
}
public class MethodReferenceTest 
{
	static void showText()
	{
		System.out.println("Hi, I am from static showText method....");
	}
	
	void showMessage()
	{
		System.out.println("Hi, I am from instance showMessage method....");
	}
	public static void main(String[] args) 
	{
		Showable s=MethodReferenceTest::showText;
		s.show();
		new Thread(MethodReferenceTest::showText).start();
		System.out.println("--------------");
		MethodReferenceTest mrt=new MethodReferenceTest();
		Showable s1=mrt::showMessage;
		s1.show();
		Showable s2=new MethodReferenceTest()::showMessage;
		s2.show();
		
		new Thread(new MethodReferenceTest()::showMessage).start();
		System.out.println("--------------");
		
		Showable2 s3=TestConstruct::new;
		s3.show("Welcome to Java !!!");
	}

}
