package com.jsp.ExceptionHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriter
{
   public static void main(String[] args) 
   {
	try {
		FileReader reader = new FileReader("abc.txt");
		FileWriter writer = new FileWriter("xyz.txt");
		 int c;
		  while((c = reader.read())!= -1)
		  {
			  System.out.println((char)c);
			  writer.write(c);
		  }
		  reader.close();
		  writer.close();
	} 
	catch (IOException e) 
	{
		e.printStackTrace();
	}
   }
}
