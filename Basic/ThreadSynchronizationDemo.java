package com.neosoft.basics;

class ThreadDemo{ 
	synchronized void doPrint(int m,int n) {
		for(int i=m;i<=m+n;i++)
		{
			System.out.print(" "+i+", ");
		}
		System.out.println("");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}	
	}
}  
public class ThreadSynchronizationDemo {

	public static void main(String args[]){  
		
		ThreadDemo obj = new ThreadDemo(); 
		  
		Thread t1=new Thread() 
		{  
			public void run()
			{  
				obj.doPrint(2,5);  
			}  
		};  
		
		Thread t2=new Thread()
		{  
			public void run()
			{  
				obj.doPrint(3,7);  
			}  
		};  
		  
		t1.start();  
		t2.start();  
		
		}  
}
