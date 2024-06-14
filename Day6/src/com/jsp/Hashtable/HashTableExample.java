package com.jsp.Hashtable;

import java.util.*;

public class HashTableExample 
{
public static void main(String[] args) 
{
	Hashtable<Integer, String> hm = new Hashtable<Integer,String>();
	hm.put(1001, "Vikas");
	hm.put(1130, "Abhilash");
	hm.put(1800, "Manoj");
	hm.put(678, "Naveen");
	for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
}
}
