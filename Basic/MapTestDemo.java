package com.neosoft.basics;
import java.util.*;
public class MapTestDemo {

	public static void main(String[] args)
	{
		//Map<String,Integer> hm=new HashMap<String,Integer>();
		//Map<String,Integer> hm=new LinkedHashMap<String,Integer>();
		Map<String,Integer> hm=new TreeMap<String,Integer>();
		hm.put("A", 100);
		hm.put("B", 200);
		hm.put("C", 300);
		hm.put("D", 400);
		hm.put("F", 100);
		hm.put("Z", 200);
		hm.put("H", 300);
		hm.putIfAbsent("D", 500);
		hm.remove("B");
		
		System.out.println(hm);
		
		for(Map.Entry<String,Integer> pair:hm.entrySet())
			System.out.println(pair.getKey()+" : "+pair.getValue());
	}
}
