package com.neosoft.basics;

import java.util.regex.*;

public class RegExTest {

	public static void main(String[] args) 
	{
		/*Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("as");
		boolean b=m.matches();
		boolean b2=Pattern.compile(".s").matcher("as").matches();
		boolean b3=Pattern.matches(".s", "as");
		System.out.println(b +" "+b2+" "+b3);
		System.out.println("--------------------");
		
		
		System.out.println(Pattern.matches("\\d", "abc"));
		System.out.println(Pattern.matches("\\d", "1"));
		System.out.println(Pattern.matches("\\d", "4443"));
		System.out.println(Pattern.matches("\\d", "323abc"));
		
		System.out.println(Pattern.matches("[0-9]", "123"));
		System.out.println(Pattern.matches("\\s", " "));
		System.out.println(Pattern.matches("\\S", "a"));
		
		System.out.println(Pattern.matches("\\w", "A"));
		
		System.out.println(Pattern.matches("A?", "A"));*/
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));
		System.out.println(Pattern.matches("\\w{6}", "arun32"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));
		
		System.out.println(Pattern.matches("[a,b,c]{3}", "abc"));

		String str="Its nice to learn Java and something";
		String expression=".*(Java|Java).*";
		System.out.println(str.matches(expression));
		
		String mobile="9876543212";
		String mobExpression="\\d{10}";
		System.out.println(mobile.matches(mobExpression));
		
		String mobileWithCode="+91-9876543212";
		String mobCodeExpression="[+]{1}[0-9]{2}[-]{1}\\d{10}";
;
		System.out.println(mobileWithCode.matches(mobCodeExpression));
		
		String email="abcd@gmail.com";
		String emailExpression="";
		System.out.println(email.matches(emailExpression));
	}

}
