package com.test;

public interface DefaultInterface
{
	default void hello()
	{
		System.out.println("Hello Interface");
	}
}
