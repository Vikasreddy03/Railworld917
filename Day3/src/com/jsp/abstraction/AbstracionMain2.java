package com.jsp.abstraction;
abstract class Shape
{
 abstract void radius();
}
class Circle extends Shape
{
	@Override
	void radius() {
		// TODO Auto-generated method stub
		System.out.println("Circle Radius is 6.5");
	}
}
	class Rectangle extends Shape
	{
		@Override
		void radius() {
			// TODO Auto-generated method stub
			System.out.println("Rectangle Radius is 7.5");
		}
	}
public class AbstracionMain2 
{
public static void main(String[] args) 
{
	Shape s = new Rectangle();
	s.radius();
}
}
