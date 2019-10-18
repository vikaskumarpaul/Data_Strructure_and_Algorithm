package com.defaultTest;

public interface Default3 extends Default2
{
	default String hello()
	{
		return "Default3";
	}
}
