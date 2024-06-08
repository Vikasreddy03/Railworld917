package Array;
import java.util.*;
public class LinarySearch 
{
	  public static void main(String args[])
	  {
		  Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  int a[]=new int[n];
		  int flag=0;
		  for(int i=0;i<n;i++)
		  {
			  a[i]=sc.nextInt();
		  }
		  int x=sc.nextInt();
		  for(int i=0;i<n;i++)
		  {
			  if(a[i]==x)
			  {
				  System.out.print(i+1);
				  flag=1;
				   break;
			  }
		  }
		  if(flag==0)
		  {
			  System.out.print(-1);
		  }
	  }
   }
