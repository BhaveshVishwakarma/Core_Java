package com.neosoft.basics;
import java.util.*;
public class ComparableTestDemo {

	public static void main(String[] args) 
	{
		ArrayList<Employee1> employees=new ArrayList<Employee1>();
		employees.add(new Employee1(108,"abc",23000));
		employees.add(new Employee1(103,"pqr",22000));
		employees.add(new Employee1(105,"xyz",27000));
		employees.add(new Employee1(102,"mno",30000));
		employees.add(new Employee1(110,"efg",22000));
		
		Collections.sort(employees,Collections.reverseOrder());
		
		for(Employee1 e:employees)
			System.out.println(e.eid+", "+e.ename+", "+e.esal);

	}

}

class Employee1 implements Comparable<Employee1>
{
	int eid;
	String ename;
	int esal;
	public Employee1(int eid, String ename, int esal) 
	{
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	
	public int compareTo(Employee1 emp)
	{
		if(this.esal==emp.esal)
			return 0;
		else if(this.esal>emp.esal)
			return 1;
		else
			return -1;
	}
	
	
}