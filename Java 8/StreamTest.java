package com.neosoft.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
public class StreamTest {

	public static void main(String[] args) 
	{
		List<Student> students=new ArrayList<Student>();
		
		students.add(new Student(1,"Bhavesh",97));
		students.add(new Student(2,"Rakesh",95));
		students.add(new Student(3,"Anand",98));
		students.add(new Student(4,"Satish",96));
		students.add(new Student(5,"Sandeep",93));
		students.add(new Student(6,"Aryan",99));
		
		List<Integer> marks=students
				.stream()
				.filter(student -> student.marks>95)
				.map(student -> student.marks)
				.collect(Collectors.toList());
		
		System.out.println(marks);
		
		students.stream()
		.filter(student -> student.marks>95)
		.forEach(student -> System.out.println(student.name));
		
		int totalMarks=students.stream()
				.map(student -> student.marks)
				.reduce(0,(sum,score) -> sum+score);
		
		System.out.println("Total Marks : "+totalMarks);
		
		
		int totalMarks2=students.stream()
				.map(student -> student.marks)
				.reduce(0,Integer::sum);
		
		
		System.out.println("Total Marks2 : "+totalMarks2);
		
		Student st1=students.stream()
				.max((s1,s2) -> s1.marks > s2.marks ? 1:-1)
				.get();
		System.out.println("Max Marks : "+ st1.marks);
		
		Student st2=students.stream()
				.max((s1,s2) -> s1.marks < s2.marks ? 1:-1)
				.get();
		System.out.println("Min Marks : "+ st2.marks);
		
		long count = students.stream().filter(student -> student.marks>95).count();
		System.out.println("Total Students having > 95 marks : "+count);
		
		Set<Integer> studentsMarks=students.stream()
				.filter(st -> st.marks<=95)
				.map(st -> st.marks)
				.collect(Collectors.toSet());
		
		System.out.println("Set : "+studentsMarks);
		
		Map<Integer,String> studentsMap=students.stream()
				.filter(st -> st.marks<=95)
				.collect(Collectors.toMap(s -> s.stid, s -> s.name));
		System.out.println("Map : "+studentsMap);
	}

}

class Student
{
	int stid;
	String name;
	int marks;
	public Student(int stid, String name, int marks) {
		super();
		this.stid = stid;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public String toString()
	{
		return stid+", "+name+", "+marks;
	}
	
	
}
