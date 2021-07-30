package com.neosoft.basics;
import java.util.*;
public class ComparatorTestDemo {

	public static void main(String[] args) 
	{
		ArrayList<Employee2> employees=new ArrayList<Employee2>();
		employees.add(new Employee2(108,"abc",23000));
		employees.add(new Employee2(103,"pqr",22000));
		employees.add(new Employee2(105,"xyz",27000));
		employees.add(new Employee2(102,"mno",30000));
		employees.add(new Employee2(110,"efg",22000));
		
		//Collections.sort(employees,new EmpIdCompare());
		//Collections.sort(employees,new EmpNameCompare());
		Collections.sort(employees,Collections.reverseOrder(new EmpSalCompare()));
		
		for(Employee2 e:employees)
			System.out.println(e.eid+", "+e.ename+", "+e.esal);

	}

}

class Employee2
{
	int eid;
	String ename;
	int esal;
	public Employee2(int eid, String ename, int esal) 
	{
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	
}

class EmpIdCompare implements Comparator<Employee2>
{
	public int compare(Employee2 o1,Employee2 o2)
	{
		if(o1.eid < o2.eid)
		return -1;
		else if(o1.eid > o2.eid)
			return 1;
		else
			return 0;
	}
}

class EmpNameCompare implements Comparator<Employee2>
{
	public int compare(Employee2 o1,Employee2 o2)
	{
		return o1.ename.compareTo(o2.ename);
	}
}

class EmpSalCompare implements Comparator<Employee2>
{
	public int compare(Employee2 o1,Employee2 o2)
	{
		if(o1.esal < o2.esal)
			return -1;
			else if(o1.esal > o2.esal)
				return 1;
			else
				return 0;
	}
}