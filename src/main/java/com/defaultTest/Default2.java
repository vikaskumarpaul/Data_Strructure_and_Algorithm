package com.defaultTest;

public interface Default2 extends Default1
{
	default String hello()
	{
		return "Default2";
	}
}
