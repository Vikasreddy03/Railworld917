package com.jsp.Abstract;

abstract class Parent
 {
	abstract void career();
    abstract void subject();
 }
class Son extends Parent
 {
	@Override
	public void career() {
		// TODO Auto-generated method stub
		System.out.println("Career");
	}

	@Override
	 public void subject() {
		// TODO Auto-generated method stub
		System.out.println("Subject");
	}
	
 }
public class Main 
{
   public static void main(String[] args) 
   {
	Parent p = new Son ();
	p.subject();
	p.career();
   }
}
