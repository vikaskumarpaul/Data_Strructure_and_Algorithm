package com.core;

public enum Test
{
	ABC("abc"), DEF("def"), GHI("ghi");
	
	private String value;
	
	Test(String value)
	{
		this.value = value;
	}
	
	public static void main(String[] args)
	{
		System.out.println(Test.values().length);
	}
	
}
