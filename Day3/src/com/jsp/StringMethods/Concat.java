package com.jsp.StringMethods;
public class Concat 
{
  public static void main(String[] args) 
  {
	  String str1 = "Hello";  
      String str2 = "Javatpoint";  
      String str3 = "Reader"; 
      String str4 = str1.concat(str2);
      String str5 = str2.concat(str3);
      String str6 = str4.concat(str5);
      System.out.println(str4);
      System.out.println(str5);
      System.out.println(str6);
  }
}
