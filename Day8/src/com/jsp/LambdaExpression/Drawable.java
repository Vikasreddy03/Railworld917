package com.jsp.LambdaExpression;
// Without Lambda Expression
interface Draw
{
	void draw();
}
    public class Drawable 
  {
      public static void main(String[] args) 
      {
		int width =10;
		 Draw d=new Draw()
		 {  
	            public void draw()
	            {
	            	System.out.println("Drawing : "+width);
	            }  
	     };  
	     d.draw();
	  }
  }
