package com.neosoft.basics;

public class withdrawException extends Exception {
	String msg;
	public withdrawException(String msg) {
		
		super(msg);
		this.msg=msg;
	}
	
	public String toString() {
		return super.getMessage();
	}
	


}
