package com.jsp.ExceptionHandling;

public class TestThrows 
{
	public static int divideNum(int m, int n) throws ArithmeticException 
	{  
        int div = m / n;  
        return div;  
    }  
    //main method  
    public static void main(String[] args) 
    {  
        TestThrows obj = new TestThrows();  
        try 
        {  
            System.out.println(obj.divideNum(45, 0));  
        }  
        catch (ArithmeticException e)
        {  
            System.out.println("\nNumber cannot be divided by 0");  
        }  
          
        System.out.println("Rest of the code..");  
    }  
}
