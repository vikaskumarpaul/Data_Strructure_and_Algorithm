package com.anonymous;

class Fruit
{
	public Fruit()
	{
		System.out.println("Super class constructor");
		System.out.println("Super class object hashcode :" + this.hashCode());
		System.out.println(this.getClass().getName());
	}
}

// sub class
class Apple extends Fruit
{
	public Apple()
	{
		System.out.println("Subclass constructor invoked");
		System.out.println("Sub class object hashcode :" + this.hashCode());
		System.out.println(this.hashCode() + "   " + super.hashCode());

		System.out.println(
				this.getClass().getName() + "  " + super.getClass().getName());
	}
}

// driver class
public class Test8
{
	public static void main(String[] args)
	{
		Apple myApple = new Apple();
	}
}
