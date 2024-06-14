package com.jsp.Hashtable;

import java.util.Hashtable;
public class HashTableMethods 
{
	public static void main(String[] args) 
	{
		Hashtable<Integer, String> hm = new Hashtable<Integer,String>();
		hm.put(1001, "Vikas");
		hm.put(1130, "Abhilash");
		hm.put(1800, "Manoj");
		hm.put(678, "Naveen");
		System.out.println("*******Before Remove*******");
		System.out.println(hm);
		System.out.println("*******After Remove********");
		hm.remove(1001);
		System.out.println(hm);
		System.out.println("*********Get or Default*****");
		System.out.println(hm.getOrDefault(1800, "Not Found"));  
	    System.out.println(hm.getOrDefault(105, "Not Found")); 
	    System.out.println("********8putIfAbsent()*******");
	    System.out.println("Initial Map: "+hm);  
	    //Inserts, as the specified pair is unique  
	    hm.putIfAbsent(104,"Gaurav");  
	    System.out.println("Updated Map: "+hm);  
	    //Returns the current value, as the specified pair already exist  
	    hm.putIfAbsent(101,"Vijay");  
	    System.out.println("Updated Map: "+hm); 
	}
}
