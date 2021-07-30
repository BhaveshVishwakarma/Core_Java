package com.neosoft.basics;
import java.io.*;
public class FileReaderDemo {

	public static void main(String[] args) throws IOException 
	{
		File file=new File("resources/Sample.txt");
		BufferedReader br=new BufferedReader(new FileReader(file));
		String line;
		while((line=br.readLine())!=null)
			System.out.println(line);
		br.close();

	}

}
