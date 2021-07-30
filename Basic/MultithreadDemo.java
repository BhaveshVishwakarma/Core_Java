package com.neosoft.basics;

class Thread1 extends Thread{
	public void run()
	{  
		String s1 = "Java is nice";
        for(int i=s1.length()-1;i>=0;i--)
        {
                System.out.print(s1.charAt(i));
                try
                {
                	Thread.sleep(1000);
                }
                catch(Exception e)
                {
                	System.out.println(e);
                }  
        }
		
	}  
}
class Thread2 extends Thread{
	public void run()
	{  
		String s1 = "Java is nice";
        for(int i=0; i<=s1.length()-1;i=i+2)
        {
            System.out.print(s1.charAt(i));
            try{
                	Thread.sleep(1000);
            }
            catch(Exception e)
            {
               System.out.println(e);
            }  
        }
		
	}  
}
public class MultithreadDemo {

	public static void main(String[] args)
	{
		System.out.println("Reverse Order of String");
		Thread1 t1 = new Thread1();
		t1.start();
		try
		{  
			  t1.join();  
	    }
		catch(Exception e)
		{
	    	 System.out.println(e);
		}
		System.out.println(" ");
		System.out.println("Alternate Characters of String");
		Thread2 t2 = new Thread2();
		t2.start();
		try
		{  
			  t2.join();  
	    }
		catch(Exception e)
		{
	    	 System.out.println(e);
		}
	}

}
