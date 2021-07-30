package com.neosoft.basics;
import java.util.*;
public class ShallowDeepCloneTest 
{
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		
		Shallow s = new Shallow(a);
		s.showData();
		a[0]=100;		
		s.showData();
		System.out.println("--------");
		
		Deep d = new Deep(a);
		d.showData();
		a[0]=500;
		d.showData();
		
		System.out.println("--------");
		s.showData();
	}
}

//Shallow copy
class Shallow{
	private int[] data;
	
	public Shallow(int[] data1) { //copy constructor
		data=data1;
	}
	
	public void showData() {
		System.out.println(Arrays.toString(data));		
	}
}

//Deep copy
class Deep{
	private int[] data;
	
	public Deep(int[] data1) {
		data=new int[data1.length];
		for(int i=0;i<data.length;i++)
			data[i]=data1[i];
		
	}
	
	public void showData() {
		System.out.println(Arrays.toString(data));		
	}
}


