package com.jsp.HashSet;
import java.util.*;
public class HashSetMethods 
 {
     public static void main(String[] args) 
     {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Surya");
		hs.add("Sandeep");
		hs.add("Vikram");
		hs.add("Ram");
		hs.add("Vishnu");
		System.out.println("**********Add Method*********");
		System.out.println(hs);
		System.out.println("**********Clone Method*******");
		hs.clone();
		System.out.println(hs);
		System.out.println("**********Contains Object Method**********");
	    System.out.println(hs.contains("Vikas"));
	    System.out.println("***********isEmpty Method***********");
	    System.out.println(hs.isEmpty());
	    System.out.println("**********iterator Method**********");
	    System.out.println(hs.iterator());
	    System.out.println("**********Remove Object**********");
	    hs.remove("Vikram");
	    System.out.println(hs);
	    System.out.println("********Size Method*********");
	    System.out.println(hs.size());
	    System.out.println("*********Spliterator Method*******");
	    System.out.println(hs.spliterator());
	    System.out.println("*********Clear Method********");
	    hs.clear();
	    System.out.println(hs);
	    System.out.println("**********Add Method*********");
	    hs.add("Vikas");
	    hs.add("Naveen");
	    hs.add("Yashwanth");
	    System.out.println(hs);
     }
 }
