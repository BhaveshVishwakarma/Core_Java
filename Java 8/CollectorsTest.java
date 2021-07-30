package com.neosoft.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsTest {

	public static void main(String[] args)
	{
List<Student> students=new ArrayList<Student>();
		
		students.add(new Student(1,"Bhavesh",97));
		students.add(new Student(2,"Rakesh",95));
		students.add(new Student(3,"Anand",98));
		students.add(new Student(4,"Satish",96));
		students.add(new Student(5,"Sandeep",96));
		students.add(new Student(6,"Aryan",98));
		
		Integer totalMarks=students.stream()
									.collect(Collectors.summingInt(st -> st.marks));
		System.out.println("Total Marks :"+totalMarks);
		
		Double avgMarks=students.stream()
				.collect(Collectors.averagingDouble(st -> st.marks));
		System.out.println("Avg Marks :"+avgMarks);
		
		Long counter=students.stream()
				.collect(Collectors.counting());
		System.out.println("Total Count :"+counter);
		
		System.out.println("----------------------");
		System.out.println(students.stream().collect(Collectors.groupingBy(st -> st.marks)));
		
		System.out.println("----------------------");
		System.out.println(students.stream().collect(Collectors.groupingBy(st -> st.marks,Collectors.counting())));

		int maxMarks=students.stream()
				.max((m1,m2)->m1.marks>m2.marks?1:-1)
				.get().marks;

		Long countMax=students.stream().filter(st -> st.marks==maxMarks)
				.collect(Collectors.counting());
		
		System.out.println("Toppers Count : "+countMax);
	}

}
