package com.neosoft.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class TrainerDemo {

	int tr_id;
	String name;
	String course;
	int salary;
	
	public TrainerDemo(int tr_id, String name, String course, int salary) {
		this.tr_id = tr_id;
		this.name = name;
		this.course = course;
		this.salary = salary;
	}
	
    public static void main(String[] args) {
		
		ArrayList<TrainerDemo> t1 = new ArrayList <TrainerDemo>();
		t1.add(new TrainerDemo(101,"Bhavesh","Java",27000));
		t1.add(new TrainerDemo(102,"Rakesh","Python",30000));
		t1.add(new TrainerDemo(103,"Anand","Java",25000));
		t1.add(new TrainerDemo(104,"Sandeep","Java",20000));
		t1.add(new TrainerDemo(105,"Satish","Python",18000));
	       
		System.out.println("Trainer's Information"+"\n");
		System.out.println("Id\tName\tCourse\tSalary");
		for(TrainerDemo t2:t1) 
		{
			if(t2.salary>20000 && t2.course.equals("Java"))
			{
				
				List<Object> trainerList = new ArrayList <Object>(Arrays.asList(t2.tr_id,t2.name,t2.course,t2.salary));
				for(Object obj:trainerList)
				{
					System.out.print(obj+"\t");
				}
				System.out.println("");
			}
			
		}
		
		Predicate<TrainerDemo> condition = trainer -> trainer.course.equals("Java") && trainer.salary>20000;
		t1.removeIf(condition);
		
		System.out.println("\n");
		System.out.println("After Filtered\n");
		System.out.println("Id\tName\tCourse\tSalary");
		Iterator<TrainerDemo> itr = t1.iterator();
		while(itr.hasNext())
		{
			TrainerDemo t3 =itr.next(); 
			System.out.println(t3.tr_id+"\t"+t3.name+"\t"+t3.course+"\t"+t3.salary);	
		}
		System.out.println("\n");
	}
}
