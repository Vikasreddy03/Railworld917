package com.jsp.LambdaExpression;

import java.util.ArrayList;
import java.util.List;



public class Drawable2 
{
	public static void main(String[] args) {
		
	
	
	List<Integer> numbers =new  ArrayList<>();
	numbers.add(1);
	numbers.add(3);
	numbers.add(5);
	numbers.add(9);
	
	for (Integer integer : numbers) {
		System.out.println(integer);
	}
	
	
	
	numbers.forEach(inte -> {
		System.out.println(inte);
		System.out.println(" i love");
	});
	
	
	
	
	}
}
