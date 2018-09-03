package com.test;

public interface FirstInterface 
{
	default String hellostring(String s1)
	{
		return s1.substring(3);
	}
}
