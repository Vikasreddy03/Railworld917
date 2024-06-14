package com.jsp.Interface;
//Interface
interface Animal
 {
  void Sound();
 }
  class Tiger implements Animal
  {
	@Override
	public void Sound() 
	{
		// TODO Auto-generated method stub
		System.out.println("Tiger Roaring");
    }
  }
  class Lion implements Animal
  {
	@Override
	public void Sound() 
	{
		// TODO Auto-generated method stub  
		System.out.println("Lion Sound");
	}
  }
public class InterfaceMain2
 {
   public static void main(String[] args) 
   {
	Animal a = new Lion();
	a.Sound();
   }
 }
