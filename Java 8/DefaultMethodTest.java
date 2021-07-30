package com.neosoft.java8;


interface DefaultShow
{
	default void showMsg()
	{
		System.out.println("Hi, This is default method !!!");
	}
	
	void show(String msg);
}
public class DefaultMethodTest implements DefaultShow {
	
	@Override
	public void show(String msg)
	{
		System.out.println("Your Msg : "+msg);
	}
	public static void main(String[] args)
	{
		DefaultMethodTest obj=new DefaultMethodTest();
		obj.show("Java 8");
		obj.showMsg();
	}

}
