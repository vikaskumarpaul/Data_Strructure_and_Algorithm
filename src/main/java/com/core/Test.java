package com.core;

public enum Test
{
	private String value;
	
	Test(String value)
	{
		this.value = value;
	}
	
	ABC("abc"), DEF("def"), GHI("ghi");
}
