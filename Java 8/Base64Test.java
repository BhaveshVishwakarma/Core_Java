package com.neosoft.java8;

import java.util.Base64;

public class Base64Test {

	public static void main(String[] args) 
	{
		String msg="Welcome to Java 8 and its nice !, \n\n Great to learn";
		System.out.println("Original Msg :"+msg);
		
		Base64.Encoder encoder=Base64.getEncoder();
		String encodedMsg=encoder.encodeToString(msg.getBytes());
		System.out.println("\nEncoded Msg :"+encodedMsg);
		
		Base64.Decoder decoder=Base64.getDecoder();
		String decodedMsg=new String(decoder.decode(encodedMsg));
		System.out.println("\nDecoded Msg :"+decodedMsg);
		
		System.out.println("----------------------------");
		
		String msg1="https://www.neosofttech.com/technologies/java";
		System.out.println("Original Msg :"+msg1);
		
		Base64.Encoder encoder1=Base64.getUrlEncoder();
		String encodedMsg1=encoder1.encodeToString(msg1.getBytes());
		System.out.println("\nEncoded Msg :"+encodedMsg1);
		
		Base64.Decoder decoder1=Base64.getUrlDecoder();
		String decodedMsg1=new String(decoder1.decode(encodedMsg1));
		System.out.println("\nDecoded Msg :"+decodedMsg1);

	}

}
