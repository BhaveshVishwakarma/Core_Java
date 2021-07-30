package com.neosoft.basics;
import java.util.*;

public class StringBufferBuilderDemo 
{
	public static void main(String[] args)
	{
		System.gc();
		long start=new GregorianCalendar().getTimeInMillis();
		long startmemory=Runtime.getRuntime().freeMemory();
		
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<1000000;i++)
		{
			sb.append(" : ").append(i);
		}
		
		long end=new GregorianCalendar().getTimeInMillis();
		long endmemory=Runtime.getRuntime().freeMemory();
		
		System.out.println("Time taken : "+(end-start));
		System.out.println("Memory used : "+(startmemory-endmemory));
	}
}
