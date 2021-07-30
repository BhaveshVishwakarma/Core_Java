package com.neosoft.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachTest {

	public static void main(String[] args) 
	{
List<Student> students=new ArrayList<Student>();
		
		students.add(new Student(1,"Bhavesh",97));
		students.add(new Student(2,"Rakesh",95));
		students.add(new Student(3,"Anand",98));
		students.add(new Student(4,"Satish",96));
		students.add(new Student(5,"Sandeep",93));
		students.add(new Student(6,"Aryan",99));
		
		students.forEach(student -> System.out.println(student.marks));
		System.out.println("-----------------");
		
		students.stream()
		.map(st -> st.name+", "+st.marks)
		.forEach(System.out::println);
		
		List<Integer> list=Arrays.asList(100,101,102,103,104);
		list.forEach(System.out::println);
	}

}
