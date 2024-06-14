package com.jsp.Collections;
import java.util.*;
public class SortArrayList
{
     public static void main(String[] args) 
     {
    	 List<String> list1 = new ArrayList<String>();
         list1.add("Mango");
         list1.add("Grapes");
         list1.add("Apple");
         list1.add("Orange");
         // Sorting the list
         Collections.sort(list1);
         for (String fruit : list1) 
         
			System.out.println(fruit);
         //Sorting the Numbers
         System.out.println("Sorting Numbers");
         List<Integer> list2 = new ArrayList<Integer>();
         list2.add(19);
         list2.add(92);
         list2.add(39);
         list2.add(84);
         Collections.sort(list2);
         for (Integer num : list2) 
         {
        	 System.out.println(num);
         }	
     }
}
