package com.jsp.Swap;

public class Swapping 
{
public void function()
  {
	 int x = 100, y = 200;
	 
    System.out.println("Before Swap");
    System.out.println("x = " + x);
    System.out.println("y = " + y);
     //Variables
     int temp = x;
     x = y;
     y = temp;
     
     System.out.println("After swap");
     System.out.println("x = " + x);
     System.out.println("y = " + y);
  }
public static void main(String[] args) 
{
	Swapping sw = new Swapping();
	System.out.println("*******");
	sw.function();
}
}
