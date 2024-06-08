package com.jsp.Patterns;
import  java.util.Scanner;
public class VShape 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Row value : ");
		int n=sc.nextInt();
		int fp=1;
		int sp=n*2-1;
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n*2-1;col++)
			{
				if(col==fp || col==sp)
					System.out.print("V");
				else
					System.out.print(" ");
			}
			System.out.println();
			fp++;
			sp--;
		   
	   }
    }
}
