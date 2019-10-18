package com.defaultTest;

public class Test implements DefaultKeeper
{
	
	static void helloInterface()
	{
		System.out.println("hello from class");
	}
	
	public static void main(String[] args)
	{
		DefaultKeeper d1 = new Test();
		d1.move("test");
		DefaultKeeper.helloInterface();
	}
}
