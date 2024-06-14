package com.jsp.Interface;
// Multiple Interface Inheritance
  interface Printable
{
	void print();
}
  interface Showable
{
	void show();
}
  class A7 implements Printable,Showable
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Showing");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printing");
	}
	  
}
  public class MultipleInterfaceMain 
{
  public static void main(String[] args) 
  {
	A7 a = new A7();
	a.print();
	a.show();
  }
}



