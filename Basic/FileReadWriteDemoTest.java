package com.neosoft.basics;
import java.io.*;
public class FileReadWriteDemoTest {

	public static void main(String[] args) throws IOException 
	{
		
		File fileRead,fileWrite=null;
		FileReader fileReader=null;
		BufferedReader bufferedReader=null;
		
		FileWriter fileWriter=null;
		BufferedWriter bufferedWriter=null;
		
		try
		{
		fileRead=new File("resources/Sample.txt");
		fileWrite=new File("resources/SampleCopy.txt");
		
		fileReader=new FileReader(fileRead);
		bufferedReader=new BufferedReader(fileReader);
		
		fileWriter=new FileWriter(fileWrite);
		bufferedWriter=new BufferedWriter(fileWriter);
		
		String line=null;
		while((line=bufferedReader.readLine())!=null)
		{
			System.out.println(line);
			bufferedWriter.write(line);
			bufferedWriter.newLine();
		}
		bufferedWriter.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				if(fileReader!=null)
					fileReader.close();
				if(bufferedReader!=null)
					bufferedReader.close();
				if(fileWriter!=null)
					fileWriter.close();
				if(bufferedWriter!=null)
					bufferedWriter.close();
			}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}

	}

}

