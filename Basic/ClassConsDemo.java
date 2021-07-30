package com.neosoft.basics;
import java.util.*;
public class ClassConsDemo {
	
	public String st_id;
    public String st_name;
    public String st_course;
    public int st_marks;

    public ClassConsDemo(String stid, String name, String course, int marks)
    {
        this.st_id=stid;
        this.st_name=name;
        this.st_course=course;
        this.st_marks=marks;
    }
    public void show()
    {	
    	if(st_marks>=60 && st_course.equals("MScIT"))
    	{
    		System.out.println(this.st_id+" "+this.st_name+" "+
    				this.st_course+" "+this.st_marks);	
    	}
    }
    
    public static void main(String args[]) {
        
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        ClassConsDemo[] st = new ClassConsDemo[5];

        for (int i = 0; i<5; i++)
        {
            
        	System.out.print("ID : ");
            String stid = sc.next();
            
            
            System.out.print("Name : ");
            String name = sc.next();
            
            
            System.out.print("Course : ");
            String course = sc.next();
            
            
            System.out.print("Marks : ");
            int marks = sc.nextInt();
            
            ClassConsDemo s = new ClassConsDemo(stid, name, course, marks);
            st[i] = s;
            
       }
       System.out.println("Student Information");
       for(int i=0;i<5;i++)
       {
    	  st[i].show(); 
       }
    
		

	}

}
