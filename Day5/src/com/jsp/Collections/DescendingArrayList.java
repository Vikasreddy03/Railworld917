package com.jsp.Collections;
import java.util.*;
public class DescendingArrayList 
{
         public static void main(String[] args) 
         {
			ArrayList<Integer> list3 = new ArrayList<Integer>();
			list3.add(54);
			list3.add(78);
			list3.add(45);
			list3.add(31);
			Collections.sort(list3,Collections.reverseOrder());
			System.out.println(list3);
		 }
}
