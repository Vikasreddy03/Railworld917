package com.jsp.Interface;
interface Car
{
	void travelling();
}
class Bmw implements Car
{
	@Override
	public void travelling() {
		// TODO Auto-generated method stub
		System.out.println("Travelling 100km");
	}
	
}
public class InterfaceMain 
{
   public static void main(String[] args) 
   {
	Car c = new Bmw();
	c.travelling();
   }
}
