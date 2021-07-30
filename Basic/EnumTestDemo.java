package com.neosoft.basics;

enum Day
{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

class DayTest
{
	Day d;
	public DayTest(Day d)
	{
		this.d=d;
	}
	public void dayCheck()
	{
		switch(d)
		{
		case MONDAY:
			System.out.println("Monday will be a very busy day...");
			break;
		case FRIDAY:
			System.out.println("Friday is better....");
			break;
		case SATURDAY:
			System.out.println("Weekend are nice......");
			break;
		case SUNDAY:
			System.out.println("Weekend are nice......");
			break;
		default:
			System.out.println("");
			break;
		}
	}
}

public class EnumTestDemo {

	public static void main(String[] args) 
	{
		//Enum_Color c1=Enum_Color.RED;
		//System.out.println(c1);

		//Day d=Day.MONDAY;
		//System.out.println(d);
		
		String st="MONDAY";
		DayTest dt=new DayTest(Day.valueOf(st));
		dt.dayCheck();
	}

}
