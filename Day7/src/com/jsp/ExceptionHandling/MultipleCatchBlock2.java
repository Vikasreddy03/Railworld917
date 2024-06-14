package com.jsp.ExceptionHandling;

public class MultipleCatchBlock2 
{
     public static void main(String[] args) 
     {
    	 try
    	 {
		int ar[] = new int[5];
		ar[5]=30/0;
		System.out.println(ar[10]);
    	 }
	 
     catch(ArithmeticException e)  
     {  
      System.out.println("Arithmetic Exception occurs");  
     }    
  catch(ArrayIndexOutOfBoundsException e)  
     {  
      System.out.println("ArrayIndexOutOfBounds Exception occurs");  
     }    
  catch(Exception e)  
     {  
      System.out.println("Parent Exception occurs");  
     }             
  System.out.println("rest of the code"); 
  }
}
