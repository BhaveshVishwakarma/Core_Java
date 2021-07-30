package com.neosoft.basics;

class Square {
	  float a1,l1;
	  public void area(int l) {
		l1=l;
	    a1 = l1*l1;
	    System.out.println("Area of Square = "+a1+" sq units");
	  }
	  public void draw()
		 {
			 System.out.println("Square Side = "+l1);
		 }
	}

class Triangle {
	  double a2,h1,b1;
	  public void area(float b,float h) {
		b1=b;
		h1=h;
		a2 = 0.5*b1*h1;
	    System.out.println("\nArea of Triangle = "+a2+" sq units");
	  }
	  public void draw()
		 {
			 System.out.println("Triangle Height = "+h1+"\tBase = "+b1);
		 }
	}
class Circle {
	  double a3,r1;
	  public void area(float r) {
		r1=r;
		a3 = 3.14*r*r;
	    System.out.println("\nArea of Circle = "+ a3+" sq units");
	  }
	  public void draw()
		 {
			 System.out.println("Circle radius = "+r1);
		 }
	}

public class Shape {
	
	public static void main(String[] args) {
	    Square s1 = new Square();
	    Triangle s2 = new Triangle();
	    Circle s3 = new Circle();
	    s1.area(7);
	    s1.draw();
	    s2.area(8,4);
	    s2.draw();
	    s3.area(7);
	    s3.draw();
	    }

}
