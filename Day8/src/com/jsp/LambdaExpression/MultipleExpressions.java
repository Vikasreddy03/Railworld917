package com.jsp.LambdaExpression;

interface Addable
 {
	void add(int x,int y);
 }
    public class MultipleExpressions
      {
	
    	public static void main(String[] args) 
    	{
			Addable a1=(a,b)->System.out.println("sum : " +(a+b));
			a1.add(100, 200);
			
			// Multiple parameters with data type in lambda expression
			Addable ad =(int a,int b)->System.out.println("Sum : " +(a+b));
			ad.add(200, 300);
		}
    	
      }
