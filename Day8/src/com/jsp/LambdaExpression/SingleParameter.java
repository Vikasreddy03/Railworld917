package com.jsp.LambdaExpression;

import java.util.List;
import java.util.Map;

public class SingleParameter
{
	
	public static void main(String[] args)
	{
		List<String> names=List.of("manoj","mango","Biryani","Bhaskar");
		
		System.out.println("============> consumer <========== ");
		names.forEach(name->System.out.println(name));
		
		
		System.out.println("============> by consumer <========== ");
		
		Map<Integer, String> cars =Map.of(1,"Audi",2,"Skoda",3,"kia");
		
		cars.forEach((u,v) ->System.out.println(u+" "+v));
		
		System.out.println("============> by Predicate <========== ");
		
	  List<String> names1 =List.of("Vikas","Vinay","Naveen","Abhilash","Varun","Kishore");
	  
	  names1.stream()
	  .filter(name2-> name2.startsWith("V") && name2.length()==5)
	  .forEach(names3->System.out.println(names3));
	  
	  
		
		
		
		
	}

}
