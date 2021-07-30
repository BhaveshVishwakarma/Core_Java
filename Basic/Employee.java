package com.neosoft.basics;

public class Employee {
	
	int id;  
	String name;
	int sal;
	Project pro;  
	  
	public Employee(int id, String name,int sal,Project pro) {  
	    this.id = id;  
	    this.name = name;  
	    this.sal=sal;  
	    this.pro=pro;
	}  
	
	void display(){  
		if(pro.pname == "E-Commerce Web-App" && sal>=25000) {
		System.out.println(id+" "+name);  
		System.out.println(pro.pid+" "+pro.pname+" "+pro.loc);  
		}  
	}
	public static void main(String[] args) {  
		Project p1=new Project(1,"Mobile-App for Project","Mumbai");  
		Project p2=new Project(2,"E-Commerce Web-App","Thane");  
		  
		Employee e1=new Employee(101,"Bhavesh",35000,p2);  
		Employee e2=new Employee(102,"Rakesh",25000,p2); 
		Employee e3=new Employee(103,"Anand",30000,p1);
		Employee e4=new Employee(104,"Sandeep",21000,p1);
		
		e1.display();
		e2.display();
		e3.display();
		e4.display();
	
		}  

}
