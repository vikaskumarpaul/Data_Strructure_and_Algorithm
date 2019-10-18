package com.defaultTest;

public interface DefaultKeeper
{
	default void move(String abc)
	{
		System.out.println("Hello from interface");
	}
	
	static void helloInterface()
	{
		System.out.println("Hello from interface");
	}
}
