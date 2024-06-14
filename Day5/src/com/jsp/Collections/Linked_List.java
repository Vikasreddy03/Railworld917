package com.jsp.Collections;

import java.util.Collections;
import java.util.LinkedList;

public class Linked_List 
{
  public static void main(String[] args) 
    {
	LinkedList<String> list4 = new LinkedList<String>();
	list4.add("Vikas");
	list4.add("Vamshi");
	list4.add("Uday");
	list4.add("Karthik");
	list4.add("Manohar");
	System.out.println("*******************");
	System.out.println(list4);
	//Sorting Names
	System.out.println("********************");
	System.out.println("Sorting Names");
	 Collections.sort(list4);
	for (String name: list4) 
	{
		System.out.println(name);
	}
	      System.out.println("********************");
          System.out.println("Using Pop Method");
          list4.pop();
          System.out.println(list4);
     
          System.out.println("*********************");
    }
}
