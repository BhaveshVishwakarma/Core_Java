package com.neosoft.basics;

//synchro

public class SyschronisationDemo1 {

	public static void main(String[] args) {
		Printer1 p = new Printer1();
		PC3 pc1 = new PC3(p);
		PC4 pc2 = new PC4(p);
		pc1.start();
		pc2.start();
	}
}

class Printer1{
	
	 void doPrint(String doc) {		
		synchronized (this){
		for(int i=1;i<=10;i++) {
			System.out.println("Printing "+doc+":"+i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		}
	}
}

class PC3 extends Thread{
	Printer1 p;
	public PC3(Printer1 p) {
		this.p=p;
	}
	
	@Override
	public void run() {
		p.doPrint("Java");
	}
}

class PC4 extends Thread{
	Printer1 p;
	public PC4(Printer1 p) {
		this.p=p;
	}
	
	@Override
	public void run() {
		p.doPrint("Python");
	}
}

